package com.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private double salary;
    private String name;

    public Person() {
    }

    public Person(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
