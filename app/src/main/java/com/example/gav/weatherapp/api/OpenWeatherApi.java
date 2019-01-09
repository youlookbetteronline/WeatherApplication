package com.example.gav.weatherapp.api;

import com.example.gav.weatherapp.model.Main;
import com.example.gav.weatherapp.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {
    String API_KEY = "e276a2c6dde7a940cac239eddbb2738b";

    @GET("/data/2.5//weather")
    Call<WeatherResponse> getCurrentWeather(
            @Query("q") String cityAndCountryCode,
            @Query("APPID") String apiKey
    );
}
