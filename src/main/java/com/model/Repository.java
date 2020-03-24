package com.model;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Person> persons = new ArrayList<>();

    public Repository() {
    }

    public Repository(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
