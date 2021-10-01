package com.java;


import java.util.ArrayList;
import java.util.List;

class A {

    public void diplay() {
        System.out.println("i m a");
    }

    public void display1() {
        System.out.println("i m display...1");
    }

}

class B extends A {
    public void diplay() throws NullPointerException {
        System.out.println("I m B");
    }

    public void display2() {
        System.out.println("i m display...2");
    }
}

interface Sum {
    int add(int a, int b);
}

public class DemoApplication1 {
    public static void main(String[] args) {

        A a = new B();
        a.diplay();

        List<Object> list = new ArrayList<>();
        list.add(4);
        list.add("Str");
        list.add(4.5);
        list.add(true);

        System.out.println(list);

        Sum sum = Integer::sum;
        System.out.println(sum.add(10, 40));

        Runnable runnable = () -> {
            System.out.println("i m runable");
        };
        runnable.run();

    }
}
