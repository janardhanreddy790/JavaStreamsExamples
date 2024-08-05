package com.nagam.java.streams.LongestStringExample;

import java.util.Arrays;
import java.util.List;

public class LongestStringExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "JavaScript", "Python", "C++");
        String longest = words.stream()
                              .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                              .orElse("");
        System.out.println("Longest word: " + longest);
    }
}