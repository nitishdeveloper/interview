package com.java.other;

import java.util.*;

public class DeviceNameSystem {
    public static void main(String[] args) {
        System.out.println(deviceNamesSystem(Arrays.asList("lamp", "lamp", "tv", "lamp")));
    }

    public static List<String> deviceNamesSystem(List<String> deviceNames) {
        List<String> answer = new ArrayList<>();

        int index = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String str : deviceNames) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
                index = map.get(str);
                answer.add(str + index);
            } else {
                map.put(str, 0);
                answer.add(str);
            }
        }

        return answer;
    }
}
