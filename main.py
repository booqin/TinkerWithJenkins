# -*- coding:utf-8 -*-
# Create by BoQin on 2018/12/06
import os

import shutil

import sys

source_dir = "/Users/vito/AndroidStudioProjects/TinkerWithJenkins/app/build/bakApk/release"
target_dir = "/Users/vito/AndroidStudioProjects/TinkerWithJenkins/bakApk"


def make_empty_dir(_dir):
    if not os.path.exists(_dir):
        os.makedirs(_dir)


def get_paths(root_source_dir, root_target_dir):
    """
    递归生成所有目标路径
    :param root_source_dir:
    :param root_target_dir:
    :return:
    """
    source_paths = []
    target_paths = []

    for filename in os.listdir(root_source_dir):

        if os.path.isdir(os.path.join(root_source_dir, filename)):
            # 路径
            _source_dir = os.path.join(root_source_dir, filename)
            _target_dir = os.path.join(root_target_dir, filename)
            # 创建空文件夹
            make_empty_dir(_target_dir)
            # 递归文件夹下的文件
            (s_paths, t_paths) = get_paths(_source_dir, _target_dir)
            source_paths.extend(s_paths)
            target_paths.extend(t_paths)
            # shutil.copyfile(s_paths, t_paths)

        else:
            # 文件
            s_path = os.path.join(root_source_dir, filename)
            t_path = os.path.join(root_target_dir, filename)
            # shutil.copyfile(s_path, t_path)
            source_paths.append(s_path)
            target_paths.append(t_path)

    return source_paths, target_paths


if __name__ == '__main__':
    if sys.argv[1] == 'PATCH':
        sp, tp = get_paths(sys.argv[3], sys.argv[2])
    else:
        sp, tp = get_paths(sys.argv[2], sys.argv[3])
    #
    # sp, tp = get_paths(sys.argv[1], sys.argv[2])
    print "Python bbbbb"
    for index in range(len(sp)):
        shutil.copyfile(sp[index], tp[index])
    print "Python eeeee"

