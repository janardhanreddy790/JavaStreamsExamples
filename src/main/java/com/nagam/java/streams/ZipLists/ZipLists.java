package com.nagam.java.streams.ZipLists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZipLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        
        List<String> zipped = IntStream.range(0, Math.min(list1.size(), list2.size()))
                                       .mapToObj(i -> list1.get(i) + "-" + list2.get(i))
                                       .collect(Collectors.toList());
        
        System.out.println("Zipped lists: " + zipped);
    }
}