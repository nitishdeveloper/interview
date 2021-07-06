package com.java8;

public class App {

    public static void main(String[] args) {
        System.out.println(new StringBuilder().append("(").append("Size").append(": ").append("Medium")
                .append("-").append("132mm").append(")").toString());
    }

    public static  void develop(){
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static  void develop1(){
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static void develop2() {
        System.out.println(new StringBuilder().append("Size: ").append("medium").append("-").append("144mm").toString());
    }

    public static void bugfix() {
        System.out.println("bugfix");
    }

    public static void feature1() {
        System.out.println("feature1");
    }

    public static void feature2() {
        System.out.println("feature2");
    }

    public static void feature3() {
        System.out.println("feature3");
    }


}
