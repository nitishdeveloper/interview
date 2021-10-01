package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DemoApplication101 {
    public static void main(String[] args) throws ClassNotFoundException {
//        List<String> list = Arrays.asList("Hello" ," ","N","i","t","i","s","h");
//        System.out.println("--------stream---------");
//        list.stream().forEach(System.out::print);

//        System.out.println();
//        String[] str = {"Hello" ," ","N","i","t","i","s","h"};
//        Arrays.stream(str).forEach(System.out::print);
//        System.out.println();
//        System.out.println("------------Parallel Stream----------");
//        Stream<String> stream = Stream.of("Hello" ," ","N","i","t","i","s","h");
//        stream.forEach(System.out::print);
//        list.parallelStream().forEachOrdered(System.out::print);


//        System.out.println();

//        Consumer<String> consumer = a -> {
//            System.out.println(a);
//            if (a != null && a.equals("t")) {
//                list.remove("s");
//            }
//        };
//        list.forEach(consumer);

//        System.out.println("-------------");
//        list.stream().forEach(consumer);

//        Class.forName("ABC");


//        List<String> strNum =Arrays.asList("1", "2", "3", "4", "5", "6","7","8","9","10","6","7","8","9","10");
//        System.out.println(strNum);
//
//        List<Integer> numList = strNum.stream().filter(v -> Integer.parseInt(v) % 2 == 0)
//                .map(Integer::valueOf).collect(Collectors.toList());
//
//        long count = strNum.stream().filter(val -> Integer.parseInt(val) > 5).count();
//        Optional<String> value = strNum.stream().filter(val->Integer.parseInt(val) > 1).findFirst();
//
//
//        Map<Object, List<String>> val = strNum.stream().collect(Collectors.groupingBy(String::valueOf));
//
//        List<String> res = strNum.stream().distinct().collect(Collectors.toList());
//
//        List<Integer> integersval = strNum.stream().map(Integer::valueOf).collect(Collectors.toList());
//
//        System.out.println("count : "+count+" value : "+value.get()+" groupBy : "+val+" distinct : "+res+" integersval : "+integersval);
//
//        System.out.println(numList);

//        Set<Employee> list = new TreeSet<>();
//        list.add(new Employee(100,"Jems",10000.00));
//        list.add(new Employee(101,"Lucy",15000.00));
//        list.add(new Employee(103,"Michel",17000.00));
//
//        System.out.println(list);


    }
}
