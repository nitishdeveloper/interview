package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TestInterview123 {
    public static void main(String[] args) {
//        reverseStringCharacter2("Nitish Prajapati");
        System.out.println(matching("([{}])"));
    }

    private static void reverseStringCharacter(String str) {
        //out = "doog gninron wollel dlorw"
        StringBuilder builder = new StringBuilder();
        char[] chArray = str.toCharArray();
        int l = 0;
        int r = chArray.length - 1;
        ;

        for (l = 0; l < r; l++) {
            char temp = chArray[l];
            chArray[l] = chArray[r];
            chArray[r] = temp;
            r--;
        }

        for (char c : chArray) {
            builder.append(String.valueOf(c));
        }
        System.out.println(builder.toString());
    }

    private static void reverseStringCharacter2(String str) {
        String[] words = str.split("\\s");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord.append(word.charAt(j));
            }
            reversedString.append(reverseWord).append(" ");
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }


//    Input : ((()
//    Output : 2
//    Explanation : ()


    private static boolean matching(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

}
