package com.nagam.java.streams.StreamToSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToSet {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "JavaScript");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println("Set: " + set);
    }
}