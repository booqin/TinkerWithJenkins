package me.boqin.tinkerwithjenkins;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.goto_qts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                RetrofitManager.getInstance().getService().homeTopPage()
//                        .subscribeOn(Schedulers.io())
//                        .subscribe(new Consumer<Object>() {
//                            @Override
//                            public void accept(Object o) throws Exception {
//
//                            }
//                        });
                  Intent intent = new Intent(Intent.ACTION_VIEW);
                  intent.setData(Uri.parse("zmxy://com.qts.customer/main/loading"));
                  startActivity(intent);
            }
        });
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("qrouter://com.qts.customer/main/loading"));
//        startActivity(intent);



    }
}
