package com.pudge.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static volatile RetrofitClient retrofitClient;
    private static final String BASE_URL = "http://120.48.101.27:9002";

    private Retrofit retrofit;
    private RetrofitClient(){
    }

    public static RetrofitClient getInstance(){
        if (retrofitClient == null){
            synchronized (RetrofitClient.class){
                if (retrofitClient == null){
                    retrofitClient = new RetrofitClient();
                }
            }
        }
        return retrofitClient;
    }

    public <T> T getService(Class<T> clz){
        return getRetrofit().create(clz);
    }

    private synchronized Retrofit getRetrofit() {
        if (retrofit == null){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        }
        return retrofit;
    }
}
