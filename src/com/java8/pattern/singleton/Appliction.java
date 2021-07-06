package com.java8.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Appliction {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton instance1 = Singleton.getInstance();


        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("text.html"));
        objectOutput.writeObject(instance1);
        objectOutput.close();

        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("text.html"));
        Singleton instance2 = (Singleton) objectInput.readObject();
        objectInput.close();

        System.out.println("singleton instance1 : "+instance1.hashCode());
        System.out.println("serialize instance2 : "+instance2.hashCode());

        Singleton instance3 = (Singleton) instance1.clone();
        System.out.println("clone instance3 : "+instance3.hashCode());

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        Singleton instance4 = null;
        for (Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            instance4 = (Singleton) constructor.newInstance();
            break;
        }
        System.out.println("clone instance4 : "+instance4.hashCode());

    }
}
