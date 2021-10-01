package com.java.other;

public class TestApplication1 extends Thread {
    public static void main(String[] args) {
        TestApplication1 t1 = new TestApplication1();
        TestApplication1 t2 = new TestApplication1();
        t1.start();
        t2.start();
    }

    public void run() {
        System.out.println("hellow run");
    }

    public void start() {
        System.out.println("hellow start");
    }
}
