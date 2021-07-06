package com.java8.multithreading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Current executing thread: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable=new MyRunnable();
        Thread thread1=new Thread(runnable,"Thread1");
        Thread thread2=new Thread(runnable,"Thread2");
        Thread thread3=new Thread(runnable,"Thread3");


        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Exiting main thread");
    }
}