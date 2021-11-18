package com.example.BS2.CityDataList;

import java.util.ArrayList;

public interface CityDataListService {
    ArrayList<String> getCities();
    void setCities(ArrayList<String> city);
    ArrayList<Integer> getInhabitants();
    void setInhabitants(ArrayList<Integer> inhabitants);
}
