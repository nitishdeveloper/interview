package com.java8.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NotificationTest {

    private volatile boolean go = false;

    public static void main(String[] args) throws InterruptedException {
        final NotificationTest notificationTest = new NotificationTest();

        Runnable waitTask = () -> {
            try {
                notificationTest.shouldGo();
            } catch (InterruptedException e) {
                Logger.getLogger(NotificationTest.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println(Thread.currentThread() + " finished Execution waiting");
        };

        Runnable notifyTask = () -> {
            notificationTest.go();
            System.out.println(Thread.currentThread() + " finished Execution notify");
        };

        Thread t1 = new Thread(waitTask ,"WTI");
        Thread t2 = new Thread(waitTask ,"WT2");
        Thread t3 = new Thread(waitTask ,"WT3");
        Thread t4 = new Thread(notifyTask ,"NT1");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("going to sleep...!!!");
        Thread.sleep(300);

        t4.start();

    }

    private synchronized void shouldGo() throws InterruptedException {
        while (!go){
            System.out.println(Thread.currentThread()+" is going to wait on this object");
            wait();
            System.out.println(Thread.currentThread()+ " is woken up");
        }
        go = false;
    }

    private synchronized void go(){
        while(!go){
            System.out.println(Thread.currentThread()+" is going to notify all or one thread waiting on this object");
            go = true;
            notifyAll();
//            notify();
        }
    }
}
