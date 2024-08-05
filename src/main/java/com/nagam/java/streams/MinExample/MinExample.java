package com.nagam.java.streams.MinExample;

import java.util.Arrays;
import java.util.List;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int min = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .min()
                         .orElse(Integer.MAX_VALUE);
        System.out.println("Min: " + min);
    }
}