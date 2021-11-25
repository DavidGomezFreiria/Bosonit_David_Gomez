package com.example.RS1.PersonControllers;


import com.example.RS1.PersonService.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeletePersonController {
    @Autowired
    PersonServiceInterface personService;

    @DeleteMapping("person/{id}")
    public String deleteMapping(@PathVariable int id) {
        personService.getPerson().removeIf(p -> p.getId() == id);
        return "Delete completed";
    }

}
