package com.example.BS0;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller2 {
    String names;
    @GetMapping("user/{name}")
    public void GetUser(@PathVariable String name){
        names = name;
    }
    @PostMapping("adduser")
    public String SendUser() {
        return names;
    }
}

