package com.weatherapp.weatherapp.di.module;

import com.weatherapp.weatherapp.data.remote.WeatherService;
import com.weatherapp.weatherapp.domain.Repository;
import com.weatherapp.weatherapp.helper.Formatter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module
public class TestNetworkModule extends NetworkModule {

    public Repository mockRepository = mock(Repository.class);

    public TestNetworkModule(String baseUrl, String apiKey) {
        super(baseUrl,apiKey);
    }

    @Override
    @Singleton
    @Provides
    Repository provideRpository(Formatter formatter, WeatherService service) {
        return mockRepository;
    }

}
