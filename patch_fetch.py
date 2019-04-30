# -*- coding:utf-8 -*-
# Create by BoQin on 2018/12/06
import os

import time

import zipfile

if __name__ == '__main__':
    # if sys.argv[1] == 'PATCH':
    #     sp, tp = get_paths(sys.argv[3], sys.argv[2])
    # else:
    #     sp, tp = get_paths(sys.argv[2], sys.argv[3])
    # zip_file_path(source_dir + "bakApk", './')

    """
    {PATH, PATCH_SOURCE_PATH, PATCH_TARGET_PATH}
    """
    file = zipfile.ZipFile(sys.argv[1])
    file.extractall(sys.argv[2])
    file.close()
