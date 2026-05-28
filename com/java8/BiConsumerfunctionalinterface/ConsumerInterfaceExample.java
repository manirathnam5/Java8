package com.java8.BiConsumerfunctionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    private static Consumer<Person> c1 = s -> System.out.println(s);
    private static Consumer<Person> c2 = s -> System.out.println(s.getName().toUpperCase());
    private static Consumer<Person> c3 = s -> System.out.println(s.getName().toUpperCase());

    private static Consumer<Person> c4 = s -> {
        if (s.getGender().equalsIgnoreCase("Male")) {
            System.out.println(s.getName());
        }
    };

    static List<Person> personList = PersonRepository.getAllPersons();


    private static void printPersonWithCondition() {
        personList.forEach(s -> {
            if (s.getGender().equals("Male") && s.getHeight() >= 140) {
                c1.andThen(c2).accept(s);
            }
        });

    }


    public static void main(String[] arg) {
        // example for String type

        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s.toUpperCase());
        c1.andThen(c2).accept("manish");

        //example for Person type data

        System.out.println("Person data ... ");

        //personList.forEach(c4);
        printPersonWithCondition();

    }

}
