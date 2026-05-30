package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamReduceExample1 {

    static BinaryOperator<Integer> bo1 = (a, b) -> a * b;
    static BinaryOperator<Integer> bo2 = (a, b) -> a + b;
    static BinaryOperator<Integer> bo3 = (a, b) -> a - b;

    public static void main(String[] arg) {

        List<Integer> arrayList = Arrays.asList(2, 3, 4, 5, 6, 7, 10);

        Optional<Integer> sum = arrayList.stream().reduce((a, b) -> a + b);

        int sum3 = arrayList.stream()
                .mapToInt(s -> s)
                .sum();

        System.out.println(sum);
        System.out.println(sum.get());
        System.out.println(sum3);


        int m1 = arrayList.stream().reduce(1, bo1);
        int m2 = arrayList.stream().reduce(1, bo2);
        int m3 = arrayList.stream().reduce(0, bo3);


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
