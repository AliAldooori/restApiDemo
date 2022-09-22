package org.ali.restapidemo.service;

import org.ali.restapidemo.exception.AliNotFound;
import org.ali.restapidemo.model.Person;
import org.ali.restapidemo.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired private PersonRepo personRepo;

    @Override
    public Person save(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person findById(Long id) {
        return personRepo.findById(id).orElseThrow(
                () -> new AliNotFound("Ali äter Flafel")
        );
    }

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }

    @Override
    public Person update(Person person) {return personRepo.save(person);}

    @Override
    public void deleteById(Long id) {personRepo.deleteById(id);}

}
