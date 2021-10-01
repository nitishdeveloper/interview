package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewTest {
    public static void main(String[] args) {
        String str = "a1b1";
        int val = 0;
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                val += Integer.parseInt(Character.toString(str.charAt(i)));
            } else {
                str1.append(str.charAt(i));
            }
        }

        System.out.println(val + " " + str1);

        val = 0;
        str1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                val += Integer.parseInt(Character.toString(str.charAt(i)));
            } else {
                str1.append(str.charAt(i));
            }
        }
        System.out.println(val + " " + str1);
    }
}
