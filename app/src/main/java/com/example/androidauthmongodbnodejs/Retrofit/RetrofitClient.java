package com.example.androidauthmongodbnodejs.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static Retrofit instace;

    public static Retrofit getInstace() {
        if(instace == null)
            instace = new Retrofit.Builder()
                    //.baseUrl("http://localhost:3000")
                    .baseUrl("http://10.0.2.2:3000")   // in emulator, localhost will changed to 10.0.2.2
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        return instace;
    }
}
