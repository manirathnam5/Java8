package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapExample2 {


    static Function<Person, String> s2 = s -> s.getName().toLowerCase();

    public static void main(String[] arg) {

        List<Person> personList = PersonRepository.getAllPersons();

        List<String> s1 = personList.stream()
                .map((s2))
                // .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(s1);
    }
}
