package com.nagam.java.streams.FindMinElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        Optional<Integer> minElement = numbers.stream()
                                              .min(Integer::compareTo);
        minElement.ifPresent(min -> System.out.println("Minimum element: " + min));
    }
}
