package com.Day1Part2.day1p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public List<Person> ListAllPerson(){
        return personRepository.findAll();
    }

    @PostMapping("/")
    public Person savePerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @PutMapping("/")
    public Person updatePerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping("/")
    public Person deletePerson(@RequestBody Person person){
        return person;

    }

}
