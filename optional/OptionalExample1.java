package optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample1 {

    static String myName(String name) {
        return name;
    }

    static String getPerson(Person person) {

        if (null != person) {
            return person.getName();
        } else {
            return "No record found ";
        }
    }


    public static Optional<String> getPersonOptional(Optional<Person> person) {

        if (person.isPresent()) {
            return Optional.of(person.get().getName());
            //return person.map( Person::getName);
        } else {
            return Optional.empty();
        }
    }


    public static void main(String[] arg) {

        Optional<String> name = Optional.ofNullable(null);

        name = Optional.empty();

        //System.out.println("Role " + name.get());

        //System.out.println("name " + (name.isPresent() ? name.get() : "No such record found "));

        //System.out.println(getPerson(new Person()));

        System.out.println(getPersonOptional(PersonRepository.getPersonOptional()));

    }

}
