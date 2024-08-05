package com.nagam.java.streams.StreamFromArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "JavaScript"};
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}