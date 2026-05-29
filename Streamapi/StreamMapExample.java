package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] arg) {


        List<String> fruitsList = Arrays.asList("Apple", "Orange", "Pineapple", "Guava", "Avacado");

        List<Integer> integerList = fruitsList.stream().map(String::length)
                                     //.toList();
                                    .collect(Collectors.toList());

        System.out.println(integerList);

    }
}
