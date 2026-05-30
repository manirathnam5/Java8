package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.Comparator;

public class StreamCustormSortExample {

    public static void main(String[] arg){

         System.out.println("Sort by Name ");

        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println(person));


        System.out.println("Sort by Name ");
        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getHeight))
                .forEach(System.out::println);

        System.out.println("Sort by Height");
        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getHeight).reversed() )
                .forEach(System.out::println);


    }
}
