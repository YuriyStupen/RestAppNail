package ru.stupen.spring.RestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stupen.spring.RestApp.models.Person;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
