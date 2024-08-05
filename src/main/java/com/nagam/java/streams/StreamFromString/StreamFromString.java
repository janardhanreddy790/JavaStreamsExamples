package com.nagam.java.streams.StreamFromString;

import java.util.stream.Stream;

public class StreamFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        Stream<Character> characterStream = str.chars().mapToObj(c -> (char) c);
        characterStream.forEach(System.out::println);
    }
}