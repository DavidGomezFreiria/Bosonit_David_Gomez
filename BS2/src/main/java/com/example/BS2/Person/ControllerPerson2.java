package com.example.BS2.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPerson2 {
    @Autowired
    PersonService personService;
    @GetMapping("/Controller2/getPerson")
    public String getPerson() {
        return "Nombre: "+personService.getName()+" Edad: "+personService.getAge()*2+" Población: "+personService.getPopulation();
    }

}
