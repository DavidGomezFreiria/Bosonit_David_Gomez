package com.example.BS0;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller2 {
    String names;
    @GetMapping("user/{name}")
    public String GetUser(@PathVariable String name,@RequestBody Person person){
        person.setName(name);
        return "Hola "+person.getName();
    }
    @PostMapping("adduser")
    public String SendUser2(@RequestBody Person person) {
        return "Nombre: "+person.getName();
    }
}
