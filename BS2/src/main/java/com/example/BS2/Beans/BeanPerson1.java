package com.example.BS2.Beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BeanPerson1 implements BeanDataList{

    String name;
    String population;
    int age;

    public String getName() {
        return name;
    }


    public String getPopulation() {
        return population;
    }


    public int getAge() {
        return age;
    }

    @Override
    public void setNameInterface(String nameInterface) {
        this.name = nameInterface;
    }

    @Override
    public void setAgeInterface(int ageInterface) {
        this.age = ageInterface;
    }

    @Override
    public void setPopulationInterface(String populationInterface) {
        this.population = populationInterface;
    }
}
