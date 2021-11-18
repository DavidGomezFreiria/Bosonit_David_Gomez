package com.example.BS2.CityDataList;

import org.springframework.web.bind.annotation.*;


@RestController
public class ControllerCityDataList {

    CityDataListService cityDataListService;
    public ControllerCityDataList (CityDataListService cityDataListService) {
        this.cityDataListService = cityDataListService;
    }
    @PostMapping("controller1/addCity")
    public void setCityData() {
        cityDataListService.getCities().add("Sevilla");
        cityDataListService.getInhabitants().add(12);
    }
    @GetMapping("controller1/getCity")
    public CityDataListService getCityData() {
        return cityDataListService;
    }
    @PostMapping("controller1/addCity/{addCity}/{addInhabitants}")
    public CityDataListService postMap1(@PathVariable String addCity, @PathVariable Integer addInhabitants){
        cityDataListService.getCities().add(addCity);
        cityDataListService.getInhabitants().add(addInhabitants);
        return cityDataListService;
    }
    /**@PostMapping("a")
    public CityDataListService postMap2(@RequestBody String addCity) {
        cityDataListService.getCities().add(addCity);
        return cityDataListService;
    }*/
}
