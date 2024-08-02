package com.nagam.java.streams.SkipElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = numbers.stream()
                                              .skip(2)
                                              .collect(Collectors.toList());
        System.out.println("After skipping first 2 elements: " + skippedNumbers);
    }
}