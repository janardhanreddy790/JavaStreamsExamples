package com.nagam.java.streams.AverageExample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        average.ifPresent(a -> System.out.println("Average: " + a));
    }
}