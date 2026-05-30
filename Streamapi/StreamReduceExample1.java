package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample1 {

    public static void main(String[] arg) {

        List<Integer> arrayList = Arrays.asList(2, 3, 4, 5, 6, 7, 10);

        Optional<Integer> sum = arrayList.stream().reduce((a, b) -> a + b);

        int sum3 =  arrayList.stream()
                .mapToInt(s -> s)
                .sum();

        System.out.println(sum);
        System.out.println(sum.get());
        System.out.println(sum3);

    }
}
