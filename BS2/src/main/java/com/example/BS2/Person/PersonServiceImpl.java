package com.example.BS2.Person;

import com.example.BS2.Person.Person;
import com.example.BS2.Person.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    com.example.BS2.Person.Person Person = new Person();

    public int getAge() {
        return Person.getAge();
    }
    public void setAge(int age) {
        Person.setAge(age);
    }
    public String getPopulation() {
        return Person.getPopulation();
    }
    public void setPopulation(String population) {
        Person.setPopulation(population);
    }
    public String getName() {
        return Person.getName();
    }
    public void setName(String name) {
        Person.setName(name);
    }

}
