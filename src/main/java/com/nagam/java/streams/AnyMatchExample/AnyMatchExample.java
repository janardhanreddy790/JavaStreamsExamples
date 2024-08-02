package com.nagam.java.streams.AnyMatchExample;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Contains an even number: " + hasEven);
    }
}