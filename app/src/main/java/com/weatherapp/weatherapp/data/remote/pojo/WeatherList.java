package com.weatherapp.weatherapp.data.remote.pojo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;


@JsonObject
public class WeatherList {

    /**
     * Time of data forecasted, unix, UTC
     */
    @JsonField(name = "dt_txt")
    private String forecastTime;

    @JsonField
    private WeatherListWeather[] weather;

    @JsonField
    private WeatherListMain main;

    public WeatherList() {
    }

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public WeatherListWeather[] getWeather() {
        return this.weather;
    }

    public void setWeather(WeatherListWeather[] weather) {
        this.weather = weather;
    }

    public WeatherListMain getMain() {
        return this.main;
    }

    public void setMain(WeatherListMain main) {
        this.main = main;
    }


}
