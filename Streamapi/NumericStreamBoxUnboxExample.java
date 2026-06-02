package Streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxUnboxExample {


    public static void main(String[] arg) {

        //converting primitive to wrapper
        boxingMethod().stream().forEach(System.out::println);
        System.out.println(unBoxingMethod(boxingMethod()));
    }

    static List<Integer> boxingMethod() {
        return IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    static int unBoxingMethod(List<Integer> list) {
        return  list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
   // exercise to perform  6.40 .09 //
  }
