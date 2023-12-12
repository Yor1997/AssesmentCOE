package com.example.assesmentcoe;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientGekentekendeVoertuigen {
    private static final String BASE_URL = "https://opendata.rdw.nl/resource/";

    public static GekentekendeVoertuigenApiService getVoertuigApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(GekentekendeVoertuigenApiService.class);
    }
}
