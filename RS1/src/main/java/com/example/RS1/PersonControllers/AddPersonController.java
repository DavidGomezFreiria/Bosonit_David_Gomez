package com.example.RS1.PersonControllers;

import com.example.RS1.PersonService.PersonService;
import com.example.RS1.PersonService.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class AddPersonController {

    @Autowired
    PersonServiceInterface personService;

    @PostMapping("person")
    public List<PersonServiceInterface> postBody(@RequestBody PersonService body ) {
        body.setId(personService.getPerson().size());
        personService.getPerson().add(body);
        return personService.getPerson();
    }
}
