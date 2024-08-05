package com.nagam.java.streams.StreamToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "JavaScript");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println("List: " + list);
    }
}