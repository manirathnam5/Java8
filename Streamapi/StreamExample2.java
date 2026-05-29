package Streamapi;

import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] arg) {

        Stream<Integer> list = Stream.of(1, 3, 4, 5, 8, 10, 12, 14, 15);
       // list.forEach(x -> System.out.println(x));

        Integer[] arr = new Integer[]{12,5,4,8,10,11,15};

        Stream<Integer>  str = Stream.of(arr);

        str.forEach(System.out::println);

    }

}
