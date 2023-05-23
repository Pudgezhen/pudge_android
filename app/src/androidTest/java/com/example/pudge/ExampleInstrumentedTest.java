package com.example.pudge;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.pudge.bean.Re;
import com.pudge.network.RetrofitClient;
import com.pudge.network.service.TestService;

import io.reactivex.rxjava3.functions.Consumer;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.pudge", appContext.getPackageName());
        Log.i("test","测试");
        while(true){}
//        RetrofitClient.getInstance().getService(TestService.class).getGoods().subscribe(new Consumer<Re>() {
//            @Override
//            public void accept(Re re) throws Throwable {
//                System.out.println(re);
//            }
//        });
//        while(true){
//
//        }
    }
}