package com.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Java8Test {

    public static void main(String[] args) {
        //convert list to stream
        List<Employee> list = getEmployeesList();

        // intermediate operations
        System.out.println("---------- limit----------------");
        list.stream().forEach(System.out::println);
        System.out.println("---------- findFirst----------------");
        Optional<Employee> employeeOptional = list.stream().findFirst();
        employeeOptional.ifPresent(System.out::println);
        System.out.println("---------- findAny----------------");
        Optional<Employee> employeeOptional1 = list.stream().filter(a -> a.getName().startsWith("R")).findAny();
        employeeOptional1.ifPresent(System.out::println);
        System.out.println("---------- anyMatch----------------");
        System.out.println(list.stream().anyMatch(a -> a.getName().startsWith("R")));
        System.out.println("---------- allMatch----------------");
        System.out.println(list.stream().allMatch(a -> a.getName().startsWith("R")));

        System.out.println("---------- nonMatch----------------");
        System.out.println(list.stream().noneMatch(a -> a.getName().startsWith("S")));

        System.out.println("---------- distinct ----------------");
        List<Employee> distinctList1 = list.stream().distinct().collect(Collectors.toList());
        distinctList1.forEach(System.out::println);

        System.out.println("---------- sorted ----------------");
        list.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList()).forEach(System.out::println);

        list.stream().max(Comparator.comparing(Employee::getSalary));

        System.out.println("---------- distinct with data ----------------");

        List<Employee> distinctList2 = list.stream().filter(e -> e.getSalary() >= 10000 && e.getName().equals("Jems")).distinct().collect(Collectors.toList());
        System.out.println(distinctList2);

        List<String> employes = list.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("employee : " + employes);

        List<String> emptyList = list.stream().map(e -> e.getName().split("")).flatMap(Arrays::stream)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(emptyList);

    }


    private static List<Employee> getEmployeesList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Jems", 10000.00));
        list.add(new Employee(100, "Jems", 10000.00));
        list.add(new Employee(100, "Jems", 10000.00));
        list.add(new Employee(100, "Jems", 10000.00));
        list.add(new Employee(101, "Lucy", 15000.00));
        list.add(new Employee(103, "Michel", 17000.00));
        list.add(new Employee(102, "Febo", 16000.00));
        list.add(new Employee(105, "Remo", 20000.00));
        list.add(new Employee(106, "Fentis", 21000.00));
        list.add(new Employee(108, "Joy", 25000.00));
        list.add(new Employee(104, "Dodo", 18000.00));
        list.add(new Employee(109, "Moni", 28000.00));
        list.add(new Employee(107, "Root", 22000.00));
        list.add(new Employee(113, "Ronaldo", 16000.00));
        list.add(new Employee(110, "Recho", 13000.00));
        list.add(new Employee(112, "Sahra", 10500.00));
        list.add(new Employee(114, "Messi", 17000.00));
        list.add(new Employee(115, "Naymar", 30000.00));
        list.add(new Employee(111, "Cherry", 11000.00));
        return list;
    }

    private static Employee[] getEmployeesArray() {
        return new Employee[]{
                new Employee(100, "Jems", 10000.00),
                new Employee(101, "Lucy", 15000.00),
                new Employee(103, "Michel", 17000.00),
                new Employee(102, "Febo", 16000.00),
                new Employee(105, "Remo", 20000.00),
                new Employee(106, "Fentis", 21000.00),
                new Employee(108, "Joy", 25000.00),
                new Employee(104, "Dodo", 18000.00),
                new Employee(109, "Moni", 28000.00),
                new Employee(107, "Root", 22000.00),
                new Employee(113, "Ronaldo", 16000.00),
                new Employee(110, "Recho", 13000.00),
                new Employee(112, "Sahra", 10500.00),
                new Employee(114, "Messi", 17000.00),
                new Employee(115, "Naymar", 30000.00),
                new Employee(111, "Cherry", 11000.00)
        };
    }

}
