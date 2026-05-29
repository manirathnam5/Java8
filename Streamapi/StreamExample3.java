package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {

    public static void main(String[] arg) {

        Predicate<Person> heightPredicate = (person -> person.getHeight() > 140);
        Predicate<Person> genderPredicate = (person -> person.getGender().equals("Female"));

        /*
        Stream<Integer>  stream = Stream.of(1,4,5,6,7) ;
        stream.forEach(System.out::println);
        Integer[] arr = new Integer[]{1,5,3,6,7,9,10,30};
        Stream<Integer> stream1 = Stream.of(arr);
        System.out.println(stream1);
        stream1.forEach(System.out::println);
       */


        Map<String, List<String>> map = PersonRepository.getAllPersons()
                .stream()
                .filter(heightPredicate.and(genderPredicate))
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));

        System.out.println(map);

        List<String> personHobbies = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getHobbies)
                .flatMap((l) -> l.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(personHobbies);


    }
}
