package com.example.assesmentcoe.api;

import com.example.assesmentcoe.api.service.GekentekendeVoertuigenBrandstofApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientGekentekendeVoertuigenBrandstof {
    private static final String BASE_URL = "https://opendata.rdw.nl/resource/";

    public static GekentekendeVoertuigenBrandstofApiService getVoertuigApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(GekentekendeVoertuigenBrandstofApiService.class);
    }
}
