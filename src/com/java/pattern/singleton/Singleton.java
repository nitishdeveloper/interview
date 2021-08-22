package com.java.pattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
    private static final long serialVersionUID = 1L;

    //lazy loading
    private static volatile Singleton instance;

    private Singleton(){
        //avoid reflection
        if(instance != null){
            throw new InstantiationError("instance already created...!!!");
        }
    }
    //double locking for multithreaded environment
    public  static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //avoid serialization
    protected Object readResolve(){
        return instance;
    }

    @Override //avoid clone
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }



}
