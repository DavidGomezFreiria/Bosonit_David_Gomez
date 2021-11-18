package com.example.BS2.CityDataList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Configuration
public class CityDataListInitializer {
    @Bean
    CityDataListService setCityData() {
        CityDataListService cd = new CityDataListServiceImpl();
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities,"Madrid", "Barcelona", "Logroño");
        ArrayList<Integer> inhabitants = new ArrayList<>();
        Collections.addAll(inhabitants, 20, 17, 9);
        cd.setCities(cities);
        cd.setInhabitants(inhabitants);
        return cd;
    }
}
