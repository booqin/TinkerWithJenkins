package me.boqin.tinkerwithjenkins;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View flutterView = Flutter.createView(
//                MainActivity.this,
//                getLifecycle(),
//                "route1"
//        );
//        FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
//        layout.leftMargin = 100;
//        layout.topMargin = 200;
//        setContentView(flutterView, layout);

//        findViewById(R.id.goto_qts).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                RetrofitManager.getInstance().getService().homeTopPage()
////                        .subscribeOn(Schedulers.io())
////                        .subscribe(new Consumer<Object>() {
////                            @Override
////                            public void accept(Object o) throws Exception {
////
////                            }
////                        });
////                  Intent intent = new Intent(Intent.ACTION_VIEW);
////                  intent.setData(Uri.parse("zmxy://com.qts.customer/main/loading"));
////                  startActivity(intent);
//                View flutterView = Flutter.createView(
//                        MainActivity.this,
//                        getLifecycle(),
//                        "route1"
//                );
//                FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
//                layout.leftMargin = 100;
//                layout.topMargin = 200;
//                setContentView(flutterView, layout);
//            }
//        });
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("qrouter://com.qts.customer/main/loading"));
//        startActivity(intent);



    }
}
