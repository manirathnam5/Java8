package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Optional;

//example using reduce() method
public class StreamReducePersonExample {

    public static void main(String[] arg) {

        String name = PersonRepository.getAllPersons()
                .stream()
                .map(person -> person.getName())
                .reduce("", (a, b) -> a + " " + (b));

        System.out.println(name);

        //find the tallest person

        Optional<Person> person = PersonRepository.getAllPersons().stream()
                .reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y);

        System.out.println("Tallest person " + person.get());

    }
}
