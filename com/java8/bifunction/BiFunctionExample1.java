package com.java8.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample1 {


    private static BiFunction<String, String, Integer> biFunction = (s, s2) -> s.concat(s2).length();

    private static Function<String, Integer> function = (str) -> str.length();


    public static void main(String[] arg) {

        System.out.println(biFunction.apply(" Manish ", " Manirathnam R"));

        System.out.println(function.apply("SamsclubWalmart"));

    }
}
