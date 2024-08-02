package com.nagam.java.streams.RemoveBelowThreshold;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveBelowThreshold {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 2, 9);
        int threshold = 5;
        List<Integer> filtered = numbers.stream()
                                        .filter(n -> n >= threshold)
                                        .collect(Collectors.toList());
        System.out.println("Numbers greater than or equal to " + threshold + ": " + filtered);
    }
}