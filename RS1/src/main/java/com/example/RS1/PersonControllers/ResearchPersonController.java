package com.example.RS1.PersonControllers;

import com.example.RS1.PersonService.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
public class ResearchPersonController {
    @Autowired
    PersonServiceInterface personService;

    @GetMapping("person/{id}")
    public Stream getMappingId(@PathVariable int id) {
        Stream filterIdList = personService.getPerson().stream()
                .filter(p -> p.getId() == id);
        return filterIdList;
    }
    @GetMapping("person/name/{name}")
    public Stream getMappingName(@PathVariable String name) {
        Stream filterNameList = personService.getPerson().stream()
                .filter(p -> p.getName().contains(name));
        return  filterNameList;
    }

}
