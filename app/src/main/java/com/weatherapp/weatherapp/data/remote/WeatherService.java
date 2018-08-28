package com.weatherapp.weatherapp.data.remote;

import com.weatherapp.weatherapp.data.remote.pojo.WeatherResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Retrofit2 interface for openweather APIs
 */

public interface WeatherService {
    @GET("city")
    Observable<WeatherResponse> fetchWeatherForecasts(@Query("id") long id);
}
