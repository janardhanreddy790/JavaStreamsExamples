package com.nagam.java.streams.StreamToArray;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript");
        String[] array = words.stream()
                              .toArray(String[]::new);
        System.out.println("Array: " + Arrays.toString(array));
    }
}