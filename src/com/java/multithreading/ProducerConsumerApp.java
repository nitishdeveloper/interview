package com.java.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerApp {

    public static void main(String[] args) {


        List<Integer> taskQueue = new ArrayList<>();
        int MAX_CAPACITY = 5;
        Producer producer = new Producer(MAX_CAPACITY, taskQueue);
        Consumer consumer = new Consumer(taskQueue);

        new Thread(
                () -> {
                    int counter = 0;
                    while (true) {
                        try {
                            producer.producer(counter++);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                , "Producer"
        ).start();

        new Thread(
                () -> {
                    while (true) {
                        try {
                            consumer.consumer();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
                , "Consumer"
        ).start();


    }
}
