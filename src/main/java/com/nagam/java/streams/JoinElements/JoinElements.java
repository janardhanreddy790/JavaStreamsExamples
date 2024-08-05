package com.nagam.java.streams.JoinElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four");
        String joined = words.stream()
                             .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
    }
}