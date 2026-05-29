package Streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] arg) {

        List<Integer> evenNumber = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> oddNumber = Arrays.asList(1, 3, 5, 7, 10);

        List<List<Integer>> flatlist = Arrays.asList(evenNumber, oddNumber);

        System.out.println("Before Flattening ");
        System.out.println(flatlist);

        List<Integer> i = flatlist.stream()
                .flatMap((list) -> list.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("After Flattening ");
        System.out.println(i);


    }
}
