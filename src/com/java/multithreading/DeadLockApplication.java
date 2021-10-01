package com.java.multithreading;


class ShareResource {

    synchronized void resource1(ShareResource resource) {
        System.out.println("start resource1 method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.resource2();
        System.out.println("end of resource1 method");
    }

    synchronized void resource2() {
        System.out.println("start of resource2 method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of resource2 method");
    }
}

class Thread1 extends Thread {

    private final ShareResource s1;
    private final ShareResource s2;

    Thread1(ShareResource s1, ShareResource s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s1.resource1(s2);
    }
}

class Thread2 extends Thread {

    private final ShareResource s1;
    private final ShareResource s2;

    Thread2(ShareResource s1, ShareResource s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s2.resource1(s1);
    }
}


public class DeadLockApplication {
    public static void main(String[] args) {

        ShareResource shared1 = new ShareResource();
        ShareResource shared2 = new ShareResource();

        Thread1 thread1 = new Thread1(shared1, shared2);
        Thread2 thread2 = new Thread2(shared1, shared2);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
