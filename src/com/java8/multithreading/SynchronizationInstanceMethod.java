package com.java8.multithreading;

public class SynchronizationInstanceMethod {

    public static void main(String[] args) {

//        SynchronizedMethodExchanger instanceMethod1 = new SynchronizedMethodExchanger();
//        SynchronizedMethodExchanger instanceMethod2 = new SynchronizedMethodExchanger();


        Thread thread1 = new Thread(
                () ->{
                    for (int i = 0; i < 1000; i++){
                        SynchornizedStaticMethod.setObject("Instance method 1");
                    }
                }
        );
        Thread thread3 = new Thread(
                () ->{
                    for (int i = 0; i < 1000; i++){
                        SynchornizedStaticMethod.setObject("Instance method 3");
                    }
                }
        );
        Thread thread2= new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++){
                        System.out.println(SynchornizedStaticMethod.getObject());
                    }
                }
        );
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
