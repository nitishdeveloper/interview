package com.java.other;

import java.util.ArrayList;

class ParentDemo {
    static int a = 10;

    public ParentDemo() {
        System.out.println("Hello ParentDemo");
    }

    public void print(String value) {
        System.out.println("String : " + value);
    }

    public void print(float value) {
        System.out.println("float : " + value);
    }

    public void print(int value) {
        System.out.println("int : " + value);
    }

    public void print(long value) {
        System.out.println("long : " + value);
    }

    protected void print() {
        System.out.println("hello parent data : " + this.a);
    }
}

class ChildDemo extends ParentDemo {

    public ChildDemo() {
        System.out.println("Hello ChildDemo");
    }

    public ChildDemo(int a) {
//        this();
        System.out.println("Hello ChildDemo : " + a);
        // this(18);
    }

    public void print(float value) {
        System.out.println("child : " + value);
    }
}

class SubChildDemo extends ChildDemo {
    public SubChildDemo() {
        super(12);
        System.out.println("SubChildDemo");
    }
}


public class JavaOppsApplication {
    public static void main(String[] args) {
        ParentDemo parentDemo = new ChildDemo();
        parentDemo.print();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("pqr");
        list1.add("tdb");

        final ArrayList<String> list2 = new ArrayList<>(list1);
        list2.add("sdsf");
        list2.add("dff");
        list2.add("sdfgfsf");

        System.out.println(list2);

//        list2 = new ArrayList<>();


        new SubChildDemo();

    }

}
