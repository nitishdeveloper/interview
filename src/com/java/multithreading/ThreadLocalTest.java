package com.java.multithreading;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StudentContext{
    private final String studentId;

    public StudentContext(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return " studentId : " + studentId;
    }
}


public class ThreadLocalTest {
    private static final ThreadLocal<StudentContext> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();



        new Thread(
                () -> {
                    threadLocal.set(new StudentContext(UUID.randomUUID().toString()));
                    System.out.println("Thread Name : "+Thread.currentThread().getName()+" userId : "+threadLocal.get());
                }
                ,"Thread-1"
        ).start();

        new Thread(
                () -> {
                    threadLocal.set(new StudentContext(UUID.randomUUID().toString()));
                    System.out.println("Thread Name : "+Thread.currentThread().getName()+" userId : "+threadLocal.get());
                }
                ,"Thread-2"
        ).start();
        new Thread(
                () -> {
                    threadLocal.set(new StudentContext(UUID.randomUUID().toString()));
                    System.out.println("Thread Name : "+Thread.currentThread().getName()+" userId : "+threadLocal.get());
                }
                ,"Thread-3"
        ).start();

        new Thread(
                () -> {
                    threadLocal.set(new StudentContext(UUID.randomUUID().toString()));
                    System.out.println("Thread Name : "+Thread.currentThread().getName()+" userId : "+threadLocal.get());
                }
                ,"Thread-4"
        ).start();
    }

}
