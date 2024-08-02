package com.nagam.java.streams.CountWordsStartingWithA;

import java.util.Arrays;
import java.util.List;

public class CountWordsStartingWithA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "blueberry");
        long count = words.stream()
                          .filter(word -> word.startsWith("a"))
                          .count();
        System.out.println("Number of words starting with 'A': " + count);
    }
}