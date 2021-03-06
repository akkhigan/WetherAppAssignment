package com.weatherapp.weatherapp.data.remote.pojo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class WeatherListMain {

    @JsonField
    private double temp;

    @JsonField
    private double temp_min;

    @JsonField
    private double grnd_level;

    @JsonField
    private double temp_kf;

    @JsonField
    private int humidity;

    @JsonField
    private double pressure;

    @JsonField
    private double sea_level;

    @JsonField
    private double temp_max;

    public WeatherListMain() {
    }

    public double getTemp() {
        return this.temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_min() {
        return this.temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getGrnd_level() {
        return this.grnd_level;
    }

    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }

    public double getTemp_kf() {
        return this.temp_kf;
    }

    public void setTemp_kf(double temp_kf) {
        this.temp_kf = temp_kf;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSea_level() {
        return this.sea_level;
    }

    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    public double getTemp_max() {
        return this.temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
}
