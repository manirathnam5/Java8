package com.java8.basics;

public class RunnableLambdaExample {

    public static void main(String[] arg){

        //befor java8
        Runnable r1 = new Runnable() {
            @Override
            public void  run() {
                System.out.println("am Thread one running in Banking Software of HSBC 1");
            }
        };


        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("am Thread one running in Banking Software of HSBC 2");
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

        //after java8

        Runnable r3 = () -> System.out.println("am thread 3 running Banking software 3");

        Runnable r4 = () -> System.out.println(" am thread 4 running Banking software 4");

        new Thread(r3).start();

        new Thread(r4).start();

    }

}
