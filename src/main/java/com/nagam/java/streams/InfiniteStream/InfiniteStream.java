package com.nagam.java.streams.InfiniteStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        List<Integer> firstTen = Stream.iterate(1, n -> n + 1)
                                       .limit(10)
                                       .collect(Collectors.toList());
        System.out.println("First 10 numbers: " + firstTen);
    }
}