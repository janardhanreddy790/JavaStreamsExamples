package com.nagam.java.streams.Fibonacci;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciNumbers = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                                               .limit(10)
                                               .map(f -> f[0])
                                               .collect(Collectors.toList());
        System.out.println("First 10 Fibonacci numbers: " + fibonacciNumbers);
    }
}
