package com.java.java8;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialAndParallelStreamTest {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("-----------Sequential Stream----------");
        test(Arrays.stream(strings).sequential());

        System.out.println("-----------Parallel Stream----------");
        test(Arrays.stream(strings).parallel());
    }

    public static void test(Stream<String> streams) {

        streams.forEach(s -> {
            System.out.println(LocalDateTime.now() + " , value : " + s + " , Thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
