package com.nagam.java.streams.ToUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercasedWords = words.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Uppercased words: " + uppercasedWords);
    }
}