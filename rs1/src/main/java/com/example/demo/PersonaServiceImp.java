package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{
    Persona Persona = new Persona();

    public int getId() {
        return Persona.getId();
    }
    public void setId(int id) {
        Persona.setId(id);
    }
}
