package com.nagam.java.streams.MaxExample;

import java.util.Arrays;
import java.util.List;

public class MaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .max()
                         .orElse(Integer.MIN_VALUE);
        System.out.println("Max: " + max);
    }
}