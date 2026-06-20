package com.java8.predicatefunctionalinterface;

import java.util.function.Predicate;

public class PredicateExample1 {


    public static void main(String[] arg) {

        Predicate<Integer> greaterthan = (a) -> (a > 10);
        Predicate<Integer> lessthan = (a) -> (a < 10);
        Predicate<Integer> equal = (a) -> (a == 10);

        System.out.println(greaterthan.and(lessthan).test(50));
        System.out.println(lessthan.and(equal).test(10));
        System.out.println(lessthan.or(equal).test(10));
        System.out.println(equal.negate().test(10));

        Boolean greaterThanResult = greaterthan.test(230);
        Boolean lessThanResult = lessthan.test(2);
        Boolean equalToResult = equal.equals(1);

        System.out.println("Given data is " + greaterThanResult);
        System.out.println("Given data is " + lessThanResult);
        System.out.println("Given data is " + equalToResult);

    }
}
