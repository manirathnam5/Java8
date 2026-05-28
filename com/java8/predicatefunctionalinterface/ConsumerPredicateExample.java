package com.java8.predicatefunctionalinterface;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class ConsumerPredicateExample {




    static BiPredicate<Integer,String> heightAndgender = (height,gender) -> height>=140 && gender.equals("Male");

    static BiConsumer<String, List<String>> biConsumer = (name , hobbies) ->
             System.out.println(" Name : " + name + " /Hobbies : " + hobbies);



    public static void main(String[] arg){

   List<Person>  personList = PersonRepository.getAllPersons();

   personList.forEach(person -> {
        if(heightAndgender.test(person.getHeight(),person.getGender())){
            biConsumer.accept(person.getName(),person.getHobbies());
        }
   });


    }
}
