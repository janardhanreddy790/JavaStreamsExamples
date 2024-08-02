package com.nagam.java.streams.CountInGroups;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountInGroups {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> countByWord = words.stream()
                                             .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Count of each word: " + countByWord);
    }
}