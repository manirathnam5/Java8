package com.java8.predicatefunctionalinterface;


//example using real time data

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    private static Predicate<Person> salaryPredicate = (person) -> person.getSalary() > 3000;

    private static Predicate<Person> genderPredicate = (person) -> (person.getGender().equalsIgnoreCase("Male"));

    public static void main(String[] arg) {

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> {
            if (salaryPredicate.and(genderPredicate).test(person)) {
                System.out.println(person);
            }
        });


    }

}
