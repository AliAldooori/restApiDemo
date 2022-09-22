package org.ali.restapidemo.controller;

import org.ali.restapidemo.model.Person;
import org.ali.restapidemo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController @RequestMapping("/api")
public class PersonController {

    @Autowired private PersonServiceImpl personService;

    @PostMapping("/person/new")
    public ResponseEntity<Person> saveNewPerson(@RequestParam String name){
        Person person = personService.save(new Person(name));
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @PostMapping("/person/new/header")
    public ResponseEntity<Person> saveNewPersonWithHeader(@RequestHeader String name){
        Person person = personService.save(new Person(name));
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping("/person/new/body")
    public ResponseEntity<Person> saveNewPersonWithBody(@RequestBody Person person){
        return new ResponseEntity<>(personService.save(person), HttpStatus.ACCEPTED);
    }

    @GetMapping("/people/one")
    public ResponseEntity<Person> getOne(){
        return new ResponseEntity<>(personService.findById(858L), HttpStatus.ACCEPTED);
    }
}
