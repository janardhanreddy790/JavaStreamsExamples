package com.nagam.java.streams.AnyNegative;

import java.util.Arrays;
import java.util.List;

public class AnyNegative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, 4, 5);
        boolean anyNegative = numbers.stream()
                                     .anyMatch(n -> n < 0);
        System.out.println("Any number is negative: " + anyNegative);
    }
}