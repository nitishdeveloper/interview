package com.java.multithreading;

public class SynchronizedMethodExchanger {

    protected Object object = null;

    public synchronized void setObject(Object o){
        System.out.println("inside method synchronized");
        this.object = o;
    }

    public  Object getObject(){
        synchronized (this) {
            System.out.println("inside synchronized block");
            return this.object;
        }
    }


}
