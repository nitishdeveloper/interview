package com.java.other;

import java.util.*;

public class ScatteredPalindrome {

    public static void main(String[] args) {
        System.out.println(method3(Arrays.asList("abc", "aabbc")));
    }

    private static List<Integer> method3(List<String> s) {

        List<Integer> result = new ArrayList<>();
        for (String str : s) {
            int answer = 0;
            int x = 0;
            Map<Integer, Integer> m = new HashMap<>();
            m.put(0, 1);
            for (char c : str.toCharArray()) {
                int d = c - 'a';
                x ^= 1 << d;
                answer = answer + m.getOrDefault(x, 0);
                for (int i = 0; i < 26; ++i) {
                    answer += m.getOrDefault(x ^ (1 << i), 0);
                }
                m.put(x, m.getOrDefault(x, 0) + 1);
            }
            result.add(answer);
        }
        return result;

    }
}
