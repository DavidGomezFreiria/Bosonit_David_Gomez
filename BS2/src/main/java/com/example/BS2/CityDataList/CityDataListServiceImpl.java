package com.example.BS2.CityDataList;

import java.util.ArrayList;

public class CityDataListServiceImpl implements CityDataListService {
    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public ArrayList<Integer> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(ArrayList<Integer> inhabitants) {
        this.inhabitants = inhabitants;
    }

    ArrayList<String> cities = new ArrayList<>();
    ArrayList<Integer> inhabitants = new ArrayList<>();
}

