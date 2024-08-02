package com.nagam.java.streams.GroupByLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four", "five");
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);
    }
}