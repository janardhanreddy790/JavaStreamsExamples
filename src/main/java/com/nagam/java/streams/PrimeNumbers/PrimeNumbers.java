package com.nagam.java.streams.PrimeNumbers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        Stream<Integer> primeStream = Stream.iterate(2, PrimeNumbers::nextPrime).limit(10);
        primeStream.forEach(System.out::println);
    }

    private static int nextPrime(int after) {
        return IntStream.iterate(after + 1, i -> i + 1)
                        .filter(PrimeNumbers::isPrime)
                        .findFirst()
                        .orElseThrow();
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(n -> number % n != 0);
    }
}