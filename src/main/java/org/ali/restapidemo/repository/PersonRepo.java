package org.ali.restapidemo.repository;

import org.ali.restapidemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query("FROM Person p WHERE p.name = ?1")
    Person getPersonByFlafel(String flafel);
}
