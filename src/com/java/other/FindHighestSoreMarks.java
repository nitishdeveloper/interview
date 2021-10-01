package com.java.other;

public class FindHighestSoreMarks {
    public static void main(String[] args) {
        int[] marks = {22, 34, 34, 34, 7};
        int count = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            if (marks[i] >= marks[i + 1]) {
                count++;
            }

        }
        System.out.println(count);
    }
}
