package com.pudge.network.service;






import com.pudge.bean.Re;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.http.GET;


public interface TestService {

    @GET("/test")
    Flowable<Re> getGoods();


}
