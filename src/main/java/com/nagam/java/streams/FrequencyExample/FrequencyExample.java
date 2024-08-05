package com.nagam.java.streams.FrequencyExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> frequency = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Frequency: " + frequency);
    }
}