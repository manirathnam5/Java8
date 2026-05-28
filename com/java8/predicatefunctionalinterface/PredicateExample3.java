/*
package com.java8.predicatefunctionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiPredicate;



public class PredicateExample3 {


    private static BiPredicate<Double,String> heightAndGender =

            (salary,gender )->(salary>=2000) & (gender.equalsIgnoreCase("Male"));

    public static void main(String[] arg){


        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> {
            if( heightAndGender.test(person.getSalary(),person.getGender()));
                 System.out.println(person);
        });


    }
}
*/
