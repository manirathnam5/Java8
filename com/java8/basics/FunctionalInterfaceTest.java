package com.java8.basics;

/*

public class FunctionalInterfaceTest {


}

*/


 @FunctionalInterface
 interface FunctionalInterfaceTest{

    public void doTest();

    public default void  showMsg(){
        System.out.println("Show messaging ");
    }

    public static void  showVoicMsg(){
        System.out.println(" Show voice Messaging ");
    }

    }
