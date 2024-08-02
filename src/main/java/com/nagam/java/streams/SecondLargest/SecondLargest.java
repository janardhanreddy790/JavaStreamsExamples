package com.nagam.java.streams.SecondLargest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 7, 3);
        Optional<Integer> secondLargest = numbers.stream()
                                                 .sorted(Comparator.reverseOrder())
                                                 .skip(1)
                                                 .findFirst();
        secondLargest.ifPresent(s -> System.out.println("Second largest element: " + s));
    }
}