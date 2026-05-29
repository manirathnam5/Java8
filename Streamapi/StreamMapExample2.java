package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExampe2 {


    public static void main(String[] arg) {

        List<Person> personList = PersonRepository.getAllPersons();

        List<String> s1 = personList.stream()
                .map((person) -> person.getName())
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(s1);

    }
}
