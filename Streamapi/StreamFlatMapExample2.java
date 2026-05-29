package Streamapi;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample2 {

    static List<String> showHobbies(List<Person> personList) {

        return personList.stream()
                .map(personList1 -> personList1.getHobbies())
                .flatMap(hobbiesList -> hobbiesList.stream())
                .collect(Collectors.toList());

    }

    static List<String> distinctHobbies(List<Person> personList) {

        return personList.stream()
                .map(personList1 -> personList1.getHobbies())
                .flatMap(hobbiesList -> hobbiesList.stream())
                .distinct()
                .collect(Collectors.toList());

    }



    public static void main(String[] arg) {

        System.out.println(showHobbies(PersonRepository.getAllPersons()));
        System.out.println(distinctHobbies(PersonRepository.getAllPersons()));
    }
}
