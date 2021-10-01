package com.java.questions;


import java.util.*;

class SortElementUsingValue {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("alex", "don");
        map.put("david", "phone");
        map.put("elle", "seeka");
        map.put("charles", "aminam");
        map.put("brian", "desto");
//        sortingByValue1(map);

        frequencyOfCharacter("Geeks For Geeks");


    }


    private static void sortingByValue(Map<String, String> map) {

        System.out.println("Before Sorting : " + map);

        Map<String, String> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        System.out.println("After Sorting : " + sortedMap);

    }

    private static void sortingByValue1(Map<String, String> map) {
        List<Map.Entry<String, String>> beforeSortedList = new ArrayList<>(map.entrySet());

        System.out.println("Before Sorting : " + map);

//        Collections.sort(beforeSortedList, (l1 , l2) -> l1.getValue().compareTo(l2.getValue()));
//        Collections.sort(beforeSortedList, Comparator.comparing(Map.Entry::getValue));
        beforeSortedList.sort(Map.Entry.comparingByValue());

        Map<String, String> afterSorted = new LinkedHashMap<>();

        for (Map.Entry<String, String> value : beforeSortedList) {
            afterSorted.put(value.getKey(), value.getValue());
        }
        System.out.println("After Sorting : " + afterSorted);
    }

    private static void frequencyOfCharacter(String str) {

        Map<Character, Integer> charfrequncy = new HashMap<>();

        String val = str.replaceAll("\\s", "");


//        for(int i = 0; i < str.length(); i++){
//            charfrequncy.put(str.charAt(i),charfrequncy.getOrDefault(str.charAt(i),0)+1);
//        }


        val.chars().forEach(m -> charfrequncy.put((char) m, charfrequncy.getOrDefault((char) m, 0) + 1));


        System.out.println("character frequency   : " + charfrequncy);
    }

    private static void frequencyOfWord(String str) {

        Map<String, Integer> wordFreq = new HashMap<>();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            wordFreq.put(words[i], wordFreq.getOrDefault(words[i], 0) + 1);
        }

        System.out.println("word frequency   : " + wordFreq);
    }

}
