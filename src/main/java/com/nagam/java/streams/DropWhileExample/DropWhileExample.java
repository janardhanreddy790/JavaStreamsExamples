package com.nagam.java.streams.DropWhileExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
                                      .dropWhile(n -> n < 4)
                                      .collect(Collectors.toList());
        System.out.println("Result after dropWhile: " + result);
    }
}