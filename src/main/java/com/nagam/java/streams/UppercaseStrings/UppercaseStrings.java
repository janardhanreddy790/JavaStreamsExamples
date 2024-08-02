package com.nagam.java.streams.UppercaseStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .toList();
        System.out.println("Uppercase Strings: " + uppercaseStrings);
    }
}