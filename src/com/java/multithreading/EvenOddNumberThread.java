package com.java.multithreading;

public class EvenOddNumberThread {
    boolean odd;
    int count = 1;
    int Max = 20;

    public void odd() {
        synchronized (this) {
            while (count < Max) {
                while (!odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("odd Thread :" + count);
                count++;
                odd = true;
                notify();
            }
        }
    }

    public void even() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            while (count < Max) {
                while (odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread :" + count);
                count++;
                odd = true;
                notify();
            }

        }
    }


    public static void main(String[] args) {
        EvenOddNumberThread evenOddNumberThread = new EvenOddNumberThread();

        Thread T1 = new Thread(evenOddNumberThread::even);
        Thread T2 = new Thread(evenOddNumberThread::odd);
        T1.start();
        T2.start();


        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
