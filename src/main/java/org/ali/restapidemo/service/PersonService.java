package org.ali.restapidemo.service;

import org.ali.restapidemo.model.Person;

import java.util.List;

public interface PersonService {
    // CRUD

    Person save(Person person);

    Person findById(Long id);
    List<Person> findAll();

    Person update(Person person);

    void deleteById(Long id);

}
