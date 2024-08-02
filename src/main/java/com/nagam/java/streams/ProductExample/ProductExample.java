package com.nagam.java.streams.ProductExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product);
    }
}