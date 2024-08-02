package com.nagam.java.streams.SortDescending;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted((a, b) -> b - a)
                                             .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + sortedNumbers);
    }
}