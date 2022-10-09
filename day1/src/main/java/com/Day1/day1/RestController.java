package com.Day1.day1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class RestController {
    private static List<Person> persons=new ArrayList<>();
    static {
        Person person=new Person();
        person.setId(100L);
        person.setCode("8080L");
        person.setName("Srishti");
        persons.add(person);

    }

    @RequestMapping("/greeting")
    public String greet() {
        return "Greeting API";
    }

    @RequestMapping(value = "/rest",method = RequestMethod.GET )
    public List<Person> getPerson(){
        return persons;
    }

    @RequestMapping(value="/rest", method = RequestMethod.POST)
    public Person savePerson(@RequestBody Person person){
        persons.add(person);
        return person;
    }

    @RequestMapping(value="/rest", method = RequestMethod.PUT)
    public Person updatePerson(@RequestBody Person person){
        Person tempPerson = new Person();
        for (Person p:persons){
            if (p.getId() == person.getId()){
                tempPerson.setName(person.getName());
                tempPerson.setCode(person.getCode());
            }
        }
        persons.add(tempPerson);
        return tempPerson;
    }
    @RequestMapping(value = "/rest/{id}", method = RequestMethod.DELETE)
    public String deletePerson(@PathVariable Long id){

        for (Person p:persons) {
            if (p.getId() == id) {
                persons.remove(p);
            }
        }
        return ("Deleted");
    }
}
