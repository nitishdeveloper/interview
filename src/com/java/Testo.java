package com.java;

import java.util.Arrays;

class OverloadedMethod {
    public void test(String obj1, Object obj2) {
        System.out.println("B");
    }

    public void test(Object obj1, String obj2) {
        System.out.println("C");
    }
}


public class Testo {
    public static void main(String[] args) {
        String[] x = {"s", "df", "ghdg"};
        System.out.println(x.length);

        double d1 = 1.13;
        double d2 = Math.round(1.13 * 100);
        int ans = (int) d2;
        System.out.println(ans);

        for (String a : x) {
            System.out.println(a);
        }

        Arrays.stream(x).forEach(System.out::println);

        OverloadedMethod obj = new OverloadedMethod();
//        obj.test(null, null);

    }
}
