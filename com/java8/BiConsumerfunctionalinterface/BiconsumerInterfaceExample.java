package com.java8.BiConsumerfunctionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiconsumerInterfaceExample {


    public static void main(String[] arg) {


        BiConsumer<Integer, Integer> consumer = (x, y) -> System.out.println(x + y);

        BiConsumer<String, String>   consumer1 = (a, b) -> System.out.println(a + "     -->  " + b);

        BiConsumer<LocalDate, Person> consumer2 = (a, b) -> System.out.println(a + "  -->  " + b);


        consumer.accept(5, 10);

        consumer1.accept("Manish", "Backend Developer");

        consumer2.accept(LocalDate.now(), new Person("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis")));


        BiConsumer<LocalTime, List<Person>> c = (a, b) -> {
            for (int i = 0; i < b.size(); i++) {
                System.out.println(a + " --> " + b.get(i));
            }
        };

        List<Person> personList = PersonRepository.getAllPersons();

        c.accept(LocalTime.now(), personList);



    }
}
