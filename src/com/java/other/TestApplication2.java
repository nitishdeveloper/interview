package com.java.other;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Parent {
    Parent() {
        System.out.println("we are parent");
    }

    public static void print() {
        System.out.println("I'm static method of parent class");
    }

    private void property() {
        System.out.println("Parents : these are all our properties");
    }

    public void property1() {
        System.out.println("Parents : these are all our properties");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("we are child");
    }

    public static void print() {
        System.out.println("I'm print method of child class");
    }

    public void property() {
        System.out.println("Child : One day all yours properties will be mine");
    }

    public void property1() {
        System.out.println("Child : I m child...!!!");
    }

    public int property1(int a, int b) {
        return a + b;
    }

    public void property1(int a, double b) {
        System.out.println(a + b);
    }

}


public class TestApplication2 {
    public static void main(String[] args) {
        PriorityQueue<Character> queue = new PriorityQueue<>();
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
        Child parent = new Child();
        parent.print();
//        ((Child) parent).property();
        parent.property1();
        System.out.println(parent.property1(1, 3));
        parent.property1(1, 2.5);
    }

    private static void add(List<Child> list) {

    }

}
