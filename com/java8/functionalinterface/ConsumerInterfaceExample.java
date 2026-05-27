package com.java8.functionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    private static Consumer<Person>  c3 = s->System.out.println(s.getName().toUpperCase());

    private static   Consumer<Person>   c4 = s -> {
        if(s.getGender().equalsIgnoreCase("Male")){
            System.out.println(s.getName());
        }
    };


    public static void main(String[] arg) {

       // example for String type

        Consumer<String> c1 = s -> System.out.println(s + 10);
        Consumer<String> c2 = s -> System.out.println(s.toUpperCase());
        c1.andThen(c2).accept("manish");

        //example for Person type data

        System.out.println("Person data ... ");
        List<Person>  personList = PersonRepository.getAllPersons();

        personList.forEach(c4);

    }
}
