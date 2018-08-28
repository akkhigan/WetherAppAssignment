package com.weatherapp.weatherapp.presentation.base;

/**
 * Interface for error and loading views
 */

public interface ErrorLoadingView extends  MvpView {

    public void showError();
    public void hideError();
    public void showLoading();
    public void hideLoading();

}
