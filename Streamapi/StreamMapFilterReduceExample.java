package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.function.Predicate;

public class StreamMapFilterReduceExample {

    static Predicate<Person>   height = per -> per.getHeight() > 165;
    static Predicate<Person>   gender = per -> per.getGender().equals("Female");

    public static  void main(String[] arg){

        int count = PersonRepository.getAllPersons()
                .stream()
                .filter(height.and(gender))
                .map(person -> person.getKids())
                .reduce(0,(x,y) -> x+y);
        System.out.println(count);

    }
}


