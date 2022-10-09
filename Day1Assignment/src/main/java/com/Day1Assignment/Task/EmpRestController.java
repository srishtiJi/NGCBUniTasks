package com.Day1Assignment.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpRestController {

    @Autowired
    private EmpRepository empRepository;

    @GetMapping("/")
    public List<Employee> ListAllPerson(){
        return empRepository.findAll();
    }

    @PostMapping("/")
    public Employee savePerson(@RequestBody Employee person){
        return empRepository.save(person);
    }

    @PutMapping("/")
    public Employee updatePerson(@RequestBody Employee person){
        return empRepository.save(person);
    }

    @DeleteMapping("/")
    public Employee deletePerson(@RequestBody Employee person){
        return person;

    }

}
