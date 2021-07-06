package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Printer{
    void execute();
}

interface Connection{
    void connect(int val);
}

interface Addition{
    int add(int a , int b);
}

class Student{
    String name;
    Integer salary;

    public Student(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

public class Main {

    public static void main(String[] args) {
        Printer print = () -> {
            System.out.println("command excepted");
        };
        print.execute();

    Connection connected = (val) -> {
        System.out.println("value : "+val);
    };

    connected.connect(19);

    Addition result = (val1 , val2) -> {
        return val1 + val2;
    };

        System.out.println(result.add(8 , 10));


        // java 8 with list

        List<Student>  list = new ArrayList<>();
        list.add(new Student("dodo",10000));
        list.add(new Student("roja" ,15000));
        list.add(new Student("james",13000));
        list.add(new Student("fari",14500));
        list.add(new Student("sami",10900));

        list.sort((Student s1, Student s2) -> {
            return s1.getSalary() - s2.getSalary();
        });

        list.forEach(
                (student) -> System.out.println(student.getName() +" "+student.getSalary())
        );

//    List<String> strlist = Array''


    }

    public static void testData(String value){
        System.out.println("data tested : "+value);
    }
}
