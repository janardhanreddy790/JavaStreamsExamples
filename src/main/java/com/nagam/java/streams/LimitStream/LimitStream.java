package com.nagam.java.streams.LimitStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(3)
                                              .collect(Collectors.toList());
        System.out.println("Limited to first 3 elements: " + limitedNumbers);
    }
}