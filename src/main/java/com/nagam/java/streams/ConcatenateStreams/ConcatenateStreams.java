package com.nagam.java.streams.ConcatenateStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "Python");
        List<String> list2 = Arrays.asList("JavaScript", "C++");
        List<String> concatenated = Stream.concat(list1.stream(), list2.stream())
                                          .collect(Collectors.toList());
        System.out.println("Concatenated list: " + concatenated);
    }
}