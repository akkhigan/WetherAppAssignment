package com.weatherapp.weatherapp;

import android.app.Application;

import com.weatherapp.weatherapp.di.component.ApplicationComponent;
import com.weatherapp.weatherapp.di.component.DaggerApplicationComponent;
import com.weatherapp.weatherapp.di.module.ApplicationModule;
import com.weatherapp.weatherapp.di.module.NetworkModule;
import com.weatherapp.weatherapp.di.module.ThreadingModule;

public class BaseApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(BuildConfig.BASE_API_ENDPOINT,BuildConfig.OPENWEATHER_API_KEY))
                .threadingModule(new ThreadingModule())
                .build();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
