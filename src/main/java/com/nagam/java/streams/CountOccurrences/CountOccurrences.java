package com.nagam.java.streams.CountOccurrences;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> occurrences = words.stream()
                                             .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Occurrences of each word: " + occurrences);
    }
}