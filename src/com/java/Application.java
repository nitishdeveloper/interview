package com.java;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();
        hashset.add(null);
        hashset.add("Java Hungry");
        hashset.add("Blogspot");
        System.out.println("Set is " + hashset);
    }
}
