package com.pudge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.pudge.R;
import com.pudge.bean.Re;
import com.pudge.network.RetrofitClient;
import com.pudge.network.service.TestService;

import io.reactivex.rxjava3.functions.Consumer;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Base_Theme_Pudge);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.test);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RetrofitClient.getInstance().getService(TestService.class).getGoods().subscribe(new Consumer<Re>() {
                    @Override
                    public void accept(Re re) throws Throwable {
                        Log.i("test","test"+re);
                    }
                });
            }
        });

    }
}