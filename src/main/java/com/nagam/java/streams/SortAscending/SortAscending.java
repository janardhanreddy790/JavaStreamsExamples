package com.nagam.java.streams.SortAscending;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " + sortedNumbers);
    }
}