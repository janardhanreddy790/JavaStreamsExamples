package com.nagam.java.streams.CountElements;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four");
        long count = words.stream()
                          .count();
        System.out.println("Count: " + count);
    }
}