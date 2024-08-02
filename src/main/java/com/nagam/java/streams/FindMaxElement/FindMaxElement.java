package com.nagam.java.streams.FindMaxElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        Optional<Integer> maxElement = numbers.stream()
                                              .max(Integer::compareTo);
        maxElement.ifPresent(max -> System.out.println("Maximum element: " + max));
    }
}