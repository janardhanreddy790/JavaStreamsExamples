package com.nagam.java.streams.ListToSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2);
        Set<Integer> numberSet = numbers.stream()
                                        .collect(Collectors.toSet());
        System.out.println("Set of elements: " + numberSet);
    }
}
