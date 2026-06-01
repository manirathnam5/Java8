package optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample3 {

    static void orElse() {
        Optional<Person> person = PersonRepository.getPersonOptional();
       Optional<Person> person1 = Optional.of(new Person());
        String name = person.map(Person::getName).orElse("Record not found");
        System.out.println("orElse :" + name);
    }


    static void orElseGet() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        Optional<Person> person1 = Optional.of(new Person());
        String name = person.map(Person::getName).orElseGet(()-> "record not found in db");
        System.out.println("orElseGet :" + name);
    }

    static void orElseThrow() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        Optional<Person> person1 = Optional.of(new Person());
        String name = person.map(Person::getName).orElseThrow(()->
            new RuntimeException("no record found 2"));

        System.out.println("orElseThrow :" + name);
    }

    public static void main(String[] arg) {

        orElse();

        orElseGet();

        orElseThrow();

    }
}
