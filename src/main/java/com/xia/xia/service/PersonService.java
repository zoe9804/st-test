package com.xia.xia.service;

import com.xia.xia.bean.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPerson();
    String addPerson(Person person);
    String deletePerson(Person person);
    Person updatePerson(Person person);
}
