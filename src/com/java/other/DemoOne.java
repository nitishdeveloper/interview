package com.java.other;


import java.io.IOException;

class Animal {

    public Animal eat(String val) throws Exception {
        System.out.println("all animals eat : " + val);
        return new Animal();
    }

    public void sleep() {
        System.out.println("all animals sleep");
    }

    public static void run() {
        System.out.println("all animal run");
    }
}

class Horse extends Animal {

    @Override
    public Horse eat(String val) throws IOException {
        System.out.println("horse eat grass...!!! -> " + val);
        return new Horse();
    }

    //    public void eat(int a)throws IOException{
//        System.out.println("horse eat grass : "+a);
//    }
//
    public static void run() {
        System.out.println("all Horse run ");
    }

}

public class DemoOne {

    public static void main(String[] args) throws Exception {
        Animal b = new Horse();
        Horse c = new Horse();
        b.eat("parent");
        c.eat("child");
    }
}

