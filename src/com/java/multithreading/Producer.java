package com.java.multithreading;

import java.util.List;

public class Producer {
    private final List<Integer> taskQueue;
    private final int MAX_CAPACITY;

    public Producer(int capacity , List<Integer> sharedQueue) {
        this.MAX_CAPACITY = capacity;
        this.taskQueue = sharedQueue;
    }


    protected void producer(int i) throws InterruptedException {
        synchronized (taskQueue){
            while (taskQueue.size() == MAX_CAPACITY){
                System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
                taskQueue.wait();
            }
            Thread.sleep(1000);
            taskQueue.add(i);
            System.out.println("produced : "+i);
            taskQueue.notifyAll();
        }
    }
}
