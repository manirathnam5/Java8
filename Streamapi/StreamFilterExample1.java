package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample1 {

    public static void main(String[] arg) {

        List<Person> personList = PersonRepository.getAllPersons();

        List<String> names = personList.stream()
                .filter((person -> person.getName().length() > 5))
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        List<String> names2 = Arrays.asList("Sam", "Anderson", "Peter", "Nancy");
        /*Stream<String> s1 =*/
        names2.stream().filter(s -> s.length() > 3)
                .forEach((s) -> System.out.println(s));

    }
}
