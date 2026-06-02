package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupByExample {


    static void groupByGender() {

        Map<String, List<Person>> groupData = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));
        Stream.of(groupData).forEach(System.out::print);
    }


    static void groupByHeight() {

        Map<String, List<Person>> groupdata = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(person -> person.getHeight() > 140 ? "Tallest" : "Shortest"));
        Stream.of(groupdata).forEach(System.out::print);

    }

    static void twoLevelGrouping() {

        Map<String,Map<String,List<Person>>>  groupdata = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.groupingBy( person -> person.getHeight() > 140 ? "Tallest" : "Shortest")));

        Stream.of(groupdata).forEach(System.out::print);
    }


    public static void main(String[] arg) {

        // groupByGender();
        // groupByHeight();
        twoLevelGrouping();
    }
}
