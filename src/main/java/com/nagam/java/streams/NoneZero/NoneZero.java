package com.nagam.java.streams.NoneZero;

import java.util.Arrays;
import java.util.List;

public class NoneZero {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean noneZero = numbers.stream()
                                  .noneMatch(n -> n == 0);
        System.out.println("No number is zero: " + noneZero);
    }
}