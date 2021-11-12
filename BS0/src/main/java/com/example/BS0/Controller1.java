package com.example.BS0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @GetMapping("HolaMundo")
    public String HolaMundo() {
        return "Hola mundo";
    }
}
