package com.nagam.java.streams.FilterAndSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "blueberry");
        List<String> filteredSorted = words.stream()
                                           .filter(w -> w.startsWith("b"))
                                           .sorted()
                                           .collect(Collectors.toList());
        System.out.println("Filtered and sorted list: " + filteredSorted);
    }
}