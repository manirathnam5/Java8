package com.java8.supplier;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceExample1 {

    private static Supplier<List<Person>> supplier1 = () -> PersonRepository.getAllPersons();

    private static Supplier<Person>      supplier2 = () -> PersonRepository.getPerson();

    static  Supplier<List<Integer>>      supplier3 = () -> Arrays.asList(2, 4, 5);


    public static void main(String[] arg) {

        System.out.print(supplier1.get());

        System.out.println(supplier2.get());

        System.out.println(supplier3.get());

    }
}
