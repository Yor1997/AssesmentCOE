package com.example.assesmentcoe.api.service;

        import com.example.assesmentcoe.model.VoertuigBrandstof;

        import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Query;
        import java.util.List;

public interface GekentekendeVoertuigenBrandstofApiService {

    @GET("8ys7-d773.json")
    Call<List<VoertuigBrandstof>> getVoertuigBrandstofDetails(@Query("kenteken") String kenteken);
}
