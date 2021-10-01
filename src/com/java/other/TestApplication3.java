package com.java.other;

import java.util.List;

interface I1 {
    void m1();
}

interface I2 {
    void m1();

    void m2();
}

class A implements I1, I2 {

    @Override
    public void m1() {
        System.out.println("i m implementations of I1");
    }

    @Override
    public void m2() {
        System.out.println("i m implementations of I2");
    }

    public int test111() {
        try {
            System.out.println("inside try");
            return 1;
        } catch (Exception e) {
            System.out.println("inside catch");
            return 1;
        } finally {
            System.out.println("inside finally");
            return -1;
        }

    }

}

public class TestApplication3 {
    public static void main(String[] args) {


        A obj = new A();
        obj.m1();
        obj.m2();
        System.out.println(obj.test111());
    }
}
