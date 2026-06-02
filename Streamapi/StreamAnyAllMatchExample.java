package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAnyAllMatchExample {

    static Predicate<String> p1 = ((var s) -> s.length() > 44);
    static Predicate<String> p2 = ((var s) -> s.length() > 4);

    static Predicate<Person> height = ((var person )-> person.getHeight() > 140);


    public static void main(String[] arg) {

        List<String> fruits = Arrays.asList("Banana", "Pineapple", "Orange", "Kiwi");

        System.out.println("fruitls Length " + fruits.stream().anyMatch(p1));

        System.out.println("fruitls Length all match " + fruits.stream().anyMatch(p1));

        Boolean allmatch = PersonRepository.getAllPersons()
                .stream()
                .allMatch(height);
        System.out.println(" allmatch " + allmatch);

        Boolean anyMatch = PersonRepository.getAllPersons()
                .stream()
                .anyMatch(height);

        System.out.println(" anyMatch " + anyMatch);

    }
}
