package com.example.assesmentcoe;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.List;

public interface VoertuigApiService {

    @GET("m9d7-ebf2.json")
    Call<List<Voertuig>> getVoertuigDetails(@Query("kenteken") String kenteken);
}

