package com.service;

import com.model.Person;
import com.model.Repository;
import service.interfaces.GetPersonDocument;
import service.interfaces.GetPersonResponseDocument;
import service.interfaces.GetPersonsBySalaryDocument;
import service.interfaces.GetPersonsBySalaryResponseDocument;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MyPersonServiceServiceSkeleton implements PersonServiceServiceSkeletonInterface {

    private static Repository repository = new Repository(new ArrayList<>());
    static {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        repository.getPersons().add(new Person(4000,"aaaaa1"));
        repository.getPersons().add(new Person(4200,"aaaaa2"));
        repository.getPersons().add(new Person(1000,"aaaaa3"));
        repository.getPersons().add(new Person(2000,"aaaaa4"));
        repository.getPersons().add(new Person(2500,"aaaaa5"));
        repository.getPersons().add(new Person(2800,"aaaaa6"));
    }

    @Override
    public GetPersonResponseDocument getPerson(GetPersonDocument getPerson) {
        String personIdS = getPerson.getGetPerson().getPersonId();
        Integer personId = Integer.parseInt(personIdS);
        service.interfaces.Person result;
        result = service.interfaces.Person.Factory.newInstance();
        if (personId < repository.getPersons().size()) {
            synchronized (PersonServiceServiceSkeleton.class) {
                Person p = repository.getPersons().get(personId);
                result.setSalary(p.getSalary());
                result.setName(p.getName());
            }
        }
        GetPersonResponseDocument responseDocument = GetPersonResponseDocument.Factory.newInstance();
        GetPersonResponseDocument.GetPersonResponse response = GetPersonResponseDocument.GetPersonResponse.Factory.newInstance();
        response.setReturn(result);
        responseDocument.setGetPersonResponse(response);
        return responseDocument;
    }

    @Override
    public GetPersonsBySalaryResponseDocument getPersonsBySalary(GetPersonsBySalaryDocument getPersonsBySalary) {
        String salaryS = getPersonsBySalary.getGetPersonsBySalary().getSalary();
        Double salary = Double.parseDouble(salaryS);
        List<service.interfaces.Person> people = new ArrayList<>();
        service.interfaces.Repository result = service.interfaces.Repository.Factory.newInstance();
        synchronized (PersonServiceServiceSkeleton.class) {
            for (Person p:
                    repository.getPersons()) {
                if (p.getSalary() > salary) {
                    service.interfaces.Person pTemp = service.interfaces.Person.Factory.newInstance();
                    pTemp.setName(p.getName());
                    pTemp.setSalary(salary);
                    people.add(pTemp);
                }
            }
            result.setPersonArray((service.interfaces.Person[]) people.toArray());
        }
        GetPersonsBySalaryResponseDocument responseDoc = GetPersonsBySalaryResponseDocument.Factory.newInstance();
        GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse response = GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse.Factory.newInstance();
        response.setReturn(result);
        responseDoc.setGetPersonsBySalaryResponse(response);
        return responseDoc;
    }
}
