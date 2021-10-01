package com.java.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindWordAndCharacterFrequency {
    public static void main(String[] args) {
        wordFrequency("fox jump over the lazy dog over dog");
        characterFrequency("fox jump over the lazy dog over dog");
    }

    private static void wordFrequency(String str) {
        String[] strA = str.split("\\s");
        System.out.println(Arrays.toString(strA));
        Map<String, Integer> map = new HashMap<>();

        for (String s : strA) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }

    private static void characterFrequency(String str) {
        String str1 = str.replaceAll("\\s", "");
        System.out.println("without space : " + str1);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}
