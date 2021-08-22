package com.java.multithreading;

public class SynchornizedStaticMethod {

    protected static Object object = null;

    public static synchronized void setObject(Object o){
        System.out.println("inside method synchronized");
        object = o;
    }

    public static Object getObject(){
        synchronized (SynchornizedStaticMethod.class) {
           System.out.println("inside synchronized block");
            return object;
        }
    }
}
