package com.java.other;

public class TestInterview {
    public static void main(String[] args) {
        /*int x = 5; int y = 10;
        try {
            y/=x;
        }catch (Exception ex){
            System.out.println("Error");
        }finally {
            System.out.println("finally");
        }*/

        try {
            throw new Exception();
        } catch (Exception ex) {
            try {
                int i = 0 / 5;
                throw new ArithmeticException();
            } catch (ArithmeticException ex1) {
                System.out.println("Exception");
            }
        }
        System.out.println("caught");
    }
}
