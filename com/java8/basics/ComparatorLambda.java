package com.java8.basics;

import java.util.Comparator;

public class ComparatorLambda {

    public static  void main(String[] arg){

        //Before java 8

        Comparator<Integer>   comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
            }
        };

        //System.out.println(comparator.compare(60,49));
        //after java8

        Comparator<Integer>  comparator1 = (o1, o2) -> o1.compareTo(o2);

        Comparator<String>   comparator2  = (s1,s2) -> s1.compareTo(s2);

        System.out.println(comparator1.compare(10,20));

        System.out.println("String comparison comparator " + "Manish".compareTo("Manirathnam") );

    }
}
