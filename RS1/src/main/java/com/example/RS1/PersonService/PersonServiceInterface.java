package com.example.RS1.PersonService;


import java.util.List;

public interface PersonServiceInterface {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
    String getPopulation();
    void setPopulation(String population);
    int getId();
    void setId(int id);
    public List<PersonServiceInterface> getPerson();
    public void setPerson(List<PersonServiceInterface> person);
}
