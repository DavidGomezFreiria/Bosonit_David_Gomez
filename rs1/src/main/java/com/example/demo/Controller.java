package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    PersonaService PersonaService;

    @PostMapping("persona")
    public String employeesPost(@RequestBody Persona Body) {
        return "Nombre: " + Body.getName() + "\nEdad:  " + Body.getEdad() + "\nPoblación:  " + Body.getPoblacion();
    }

    @GetMapping("persona/{id}")
    public String employeesId(@PathVariable int id) {
        PersonaService.setId(id);
        return "ID: " + id;
    }

    @PutMapping("persona/{id}/")
    public String postEmployeeInfo(@PathVariable int id, @RequestBody Persona Body, @RequestParam String Name) {
        Body.setId(id);
        if (Name == null) {
            return "envie el nombre correctamente";
        } else if (id == 1313) {
            Body.setName(Name);
            return "Nombre: " + Body.getName() + "\nEdad:  " + Body.getEdad() + "\nPoblación:  " + Body.getPoblacion();
        } else {
            return "Nombre: " + Body.getName() + "\nEdad:  " + Body.getEdad() + "\nPoblación:  " + Body.getPoblacion();
        }
    }
}
