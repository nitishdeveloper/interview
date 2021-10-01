package com.java;

import java.util.*;

public class InterviewQuestion1 {
    public static void main(String[] args) {
        frequencies("apple,mango,grapes,bannana,mango,apple,mango");


        String name = "other";
        String name1 = new String("other");
        Map<String, Integer> map = new HashMap<>();

        map.put(name, 1);
        map.put(name1, 2);

        System.out.println(map.get(name));

    }

    private static void frequencies(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] split = str.split(",");
        for (String s : split) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println("frequencies : " + map);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        System.out.println("result : " + list);
    }

}
