package com.nagam.java.streams.FlattenLists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        List<Integer> flattened = listOfLists.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened);
    }
}