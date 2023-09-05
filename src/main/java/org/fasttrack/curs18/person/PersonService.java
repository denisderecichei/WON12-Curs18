package org.fasttrack.curs18.person;

import org.fasttrack.curs18.controller.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private List<Person> allPersons;

    public PersonService() {
        this.allPersons = List.of(
                new Person("A", 1),
                new Person("B", 2),
                new Person("C", 3),
                new Person("D", 4)
        );
    }

    public List<Person> getAllPersons() {
        return allPersons;
    }
}
