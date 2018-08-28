package com.weatherapp.weatherapp.presentation.home;

import java.util.List;

/**
 * Model for data to fill home screen
 */

public class HomeModel {

    private String town;
    private List<HomeItem> list;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<HomeItem> getList() {
        return list;
    }

    public void setList(List<HomeItem> list) {
        this.list = list;
    }
}
