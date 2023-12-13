package com.example.assesmentcoe.api.service;

import com.example.assesmentcoe.model.Voertuig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.List;

public interface GekentekendeVoertuigenApiService {

    @GET("m9d7-ebf2.json")
    Call<List<Voertuig>> getVoertuigDetails(@Query("kenteken") String kenteken);
}

