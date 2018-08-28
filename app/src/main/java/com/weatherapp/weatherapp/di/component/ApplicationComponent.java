package com.weatherapp.weatherapp.di.component;

import com.weatherapp.weatherapp.di.module.ApplicationModule;
import com.weatherapp.weatherapp.di.module.NetworkModule;
import com.weatherapp.weatherapp.di.module.ThreadingModule;
import com.weatherapp.weatherapp.presentation.home.HomePresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={ApplicationModule.class,NetworkModule.class,ThreadingModule.class})
public interface ApplicationComponent {

    void inject(HomePresenterImpl presenter);
}
