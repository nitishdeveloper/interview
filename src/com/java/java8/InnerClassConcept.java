package com.java.java8;

import java.io.OutputStream;

class OuterClass {

    int value = 10;
    static int value2 = 20;

    public void print() {
        System.out.println("Hello Outside");
        String name = "nitish";
        class LocalInnerClass {
            LocalInnerClass() {
                System.out.println("local inner class constructor calling " + name);
            }

            void msg() {
                System.out.println("local inner class method  :" + name);
            }

            static void msg1() {
                System.out.println("local inner class method  :" + value2);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.msg();
        localInnerClass.msg1();

    }

    class InnerClass {
        public void printInnerClass() {
            System.out.println("value : " + value + " static value : " + value2);
            print();
        }

        InnerClass() {
            System.out.println("calling inner class constructor");
        }
    }

    static class StaticInnerClass {
        StaticInnerClass() {
            System.out.println("static inner class constructor");
        }

        void staticInnerMethod() {
            System.out.println("static inner class : " + value2);
        }

    }
}

public class InnerClassConcept {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printInnerClass();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.staticInnerMethod();

        OuterClass outerClass1 = new OuterClass() {
            public void print() {
                System.out.println("i m anonymous class..!!!!");
            }
        };
        outerClass1.print();
    }

}
