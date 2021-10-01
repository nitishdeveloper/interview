package com.java.multithreading;

public class PrintEvenOddThread2 implements Runnable {
    static int number = 1;
    int rem = 0;
    static final Object lock = new Object();

    PrintEvenOddThread2(int reminder) {
        this.rem = reminder;
    }

    @Override
    public void run() {
        while (number < 20) {
            synchronized (lock) {
                while (number % 2 != rem) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " -> " + number);
                number++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        PrintEvenOddThread2 even = new PrintEvenOddThread2(0);
        PrintEvenOddThread2 odd = new PrintEvenOddThread2(1);


        Thread thread1 = new Thread(even, "Even");
        Thread thread2 = new Thread(odd, "Odd");
        thread1.start();
        thread2.start();

    }
}
