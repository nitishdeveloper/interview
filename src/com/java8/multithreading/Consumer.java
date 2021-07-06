package com.java8.multithreading;

import java.util.List;

public class Consumer {
    private final List<Integer> taskQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.taskQueue = sharedQueue;
    }


    protected void consumer() throws InterruptedException {
        synchronized (taskQueue){
             while (taskQueue.isEmpty()){
                 System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
                 taskQueue.wait();
             }
             Thread.sleep(1000);
             int i = taskQueue.remove(0);
            System.out.println("consumed : "+i);
            taskQueue.notifyAll();
        }
    }
}
