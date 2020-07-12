package com.martyanto.coronainfo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by martyanto on 20/06/2020.
 */

public class ApiService {

    public static Retrofit getRetrofitService() {
        return new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
