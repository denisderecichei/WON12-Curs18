package org.fasttrack.curs18.controller;

import org.fasttrack.curs18.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("hello")
    public String sayHello() {
        System.out.println("Apelat din endpoint");
        return "Bine ati venit pe serverul meu!";
    }

    @GetMapping("persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("persons/{name}")
    public Person getPersonByName(@PathVariable String name,
                                  @RequestParam(required = false) int age) {
        return personService.getAllPersons().stream()
                .filter(pers -> pers.getName().equals(name))
                .filter(pers -> pers.getAge() == age)
                .findFirst()
                .orElse(new Person("NOT FOUND ", 9999999));
    }
}
