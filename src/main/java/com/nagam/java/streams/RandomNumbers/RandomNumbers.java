package com.nagam.java.streams.RandomNumbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> randomNumbers = IntStream.range(0, 10)
                                               .map(i -> (int) (Math.random() * 100))
                                               .boxed()
                                               .collect(Collectors.toList());
        System.out.println("List of random numbers: " + randomNumbers);
    }
}