package com.nagam.java.streams.MinMaxValue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Minimum value: " + m));
        max.ifPresent(m -> System.out.println("Maximum value: " + m));
    }
}