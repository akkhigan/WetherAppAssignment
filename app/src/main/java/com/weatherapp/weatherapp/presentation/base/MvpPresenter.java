package com.weatherapp.weatherapp.presentation.base;

/**
 * Interface for all presenters
 */

public interface MvpPresenter<V extends MvpView> {
    public void attachView(V mvpView);
    public void detachView();

}
