package com.nagam.java.streams.ToLowercase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("HELLO", "WORLD");
        List<String> lowercaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase words: " + lowercaseWords);
    }
}