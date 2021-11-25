package com.example.RS1.PersonControllers;

import com.example.RS1.PersonService.PersonService;
import com.example.RS1.PersonService.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class UpdatePersonController {
    @Autowired
    PersonServiceInterface personService;

    @PutMapping("person/{id}")
    public Stream putMapping(@PathVariable int id, @RequestBody PersonService body) {
        Stream filterIdList = personService.getPerson().stream()
                .filter(p -> p.getId() == id)
                .map(p -> {if(body.name != null){p.setName(body.name);}
                    if(body.age != 0){p.setAge(body.age);}
                    if(body.population != null){p.setPopulation(body.population);}
                return p;});
        return filterIdList;
    }
}
