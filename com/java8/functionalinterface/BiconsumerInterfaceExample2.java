package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

//BiConsumer example using simple datatype

public class BiconsumerInterfaceExample2 {

    public static void main(String[] arg){

        BiConsumer<Integer,Integer>   biConsumer  = (a,b) -> System.out.println(a+b);

        BiConsumer<Integer,Integer>   biConsumer1 = (a,b) -> System.out.println(a-b);

        biConsumer.andThen(biConsumer1).accept(10,20);

        List<Integer>   list1 = Arrays.asList(2,4,6,7,8);
        List<Integer>   list2 = Arrays.asList(54,66,77,88);

        BiConsumer<List<Integer>,List<Integer>>  c = (a,b) -> {

            if(a.size() == b.size()){
                System.out.println("Both list are equal in size ");
            }else{
                System.out.println("Both list are not equal in size ");
             }
         };

        c.accept(list1,list2);


    }
}
