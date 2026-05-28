package com.java8.functionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerInterfaceExample3 {


    private static List<Person>  personList = PersonRepository.getAllPersons();

    private static  BiConsumer<String, List<String>>  hobbies = (person,hobbies ) -> {
            System.out.println("Name : "+ person + " / " + hobbies );
    };

    private static  BiConsumer<String , Double>  salary = (person , salary) -> {
         System.out.println("Name : "+person + "  /" + salary);
     };



public static void main(String[] arg){

         fetchHobbies();
         System.out.println("Employee  hobbies and salary  ");
         fetchSalary();

    }

    static void fetchHobbies(){
       personList.forEach( person -> {
           hobbies.accept(person.getName() , person.getHobbies());
       });
    }

    static void fetchSalary(){
     personList.forEach(person -> {
         salary.accept(person.getName(),person.getSalary());
     });
    }
}
