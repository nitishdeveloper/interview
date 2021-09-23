package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
       /* System.out.println(new StringBuilder().append("(").append("Size").append(": ").append("Medium")
                .append("-").append("132mm").append(")").toString());*/
        feature3();

    }

    public static  void develop(){
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static  void develop1(){
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static void develop2() {
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static void bugfix() {
        System.out.println("bugfix");
    }

    public static void feature1() {
        System.out.println("feature1");
    }

    public static void feature2() {
        System.out.println("feature2");
    }

    public static void feature3() {
        String name = "Nitish";
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream();
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);
        List<String> list = new ArrayList<>();
        stream.forEach(e -> {
            if (e == 5) {
                list.add("Prajapati");
            }
        });
        System.out.println(list);
    }


}
