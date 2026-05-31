package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxExample {

    private static Optional<Person> showTallestPerson() {
        return PersonRepository.getAllPersons().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));

    }

    private static Optional<Person> showShortestPerson() {
        return PersonRepository.getAllPersons().stream()
                .collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));

    }

    static List<Person> filterMultiplePerson() {
        List<Person> personList = new ArrayList<>();
        Person tallestPerson = showTallestPerson().get();
        if (null != tallestPerson) {
            personList = PersonRepository.getAllPersons()
                    .stream()
                    .filter(person -> person.getHeight() == tallestPerson.getHeight())
                    .collect(Collectors.toList());
        }
        return personList;
    }

    public static void main(String[] arg) {


        System.out.println(showTallestPerson().get());

        System.out.println(showShortestPerson().get());

        System.out.println(filterMultiplePerson());
    }

}
