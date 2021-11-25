package com.example.RS1.PersonService;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonService implements PersonServiceInterface {
    public  String name;
    public int age;
    public String population;
    public int id;
    List<PersonServiceInterface> person = new ArrayList<>();

    public List<PersonServiceInterface> getPerson() {
        return person;
    }

    public void setPerson(List<PersonServiceInterface> person) {
        this.person = person;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}