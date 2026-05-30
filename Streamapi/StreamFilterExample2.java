package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.function.Predicate;

public class StreamFilterExample2 {


    static Predicate<Person> height = (i -> (i.getHeight() > 140));
    static Predicate<Person> gender = (j -> j.getGender().equals("Female"));
    static Predicate<Person> salary = (k -> k.getSalary() > 4000);


    public static void main(String[] arg) {

        PersonRepository.getAllPersons()
                .stream()
                .filter(height.and(gender).and(salary)).forEach(System.out::println);

    }
}
