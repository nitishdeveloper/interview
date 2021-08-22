package com.java.multithreading;

class TestRunable implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i < 6; i++){
            System.out.println("thread - "+i+" ");
        }
    }
}


class TestThread1 extends Thread{

    @Override
    public void run() {
        for(int i = 1; i < 6; i++){
            System.out.println("thread - "+i+" ");
        }
    }
}


public class MyThread {
    public static void main(String[] args) {

//        TestRunable job1 = new TestRunable();

        TestThread1 job1 = new TestThread1();
        job1.start();
//        Thread thread = new Thread(job1);
//        thread.start();
    }



}
