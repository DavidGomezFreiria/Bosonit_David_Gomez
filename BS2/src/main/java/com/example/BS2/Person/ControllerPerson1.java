package com.example.BS2.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ControllerPerson1 {
    @Autowired
    PersonService personService;

    @GetMapping("/Controller1/addPerson")
    public String getPerson(@RequestHeader int age, @RequestHeader String name, @RequestHeader String population) {
        personService.setAge(age);
        personService.setName(name);
        personService.setPopulation(population);
        return "Nombre: " + personService.getName() + " Edad: " + personService.getAge() + " Población: " + personService.getPopulation();
    }
}
