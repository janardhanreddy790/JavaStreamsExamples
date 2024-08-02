package com.nagam.java.streams.PrimesLessThanN;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimesLessThanN {
    public static void main(String[] args) {
        int N = 20;
        List<Integer> primes = IntStream.range(2, N)
                                        .filter(PrimesLessThanN::isPrime)
                                        .boxed()
                                        .collect(Collectors.toList());
        System.out.println("Primes less than " + N + ": " + primes);
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(i -> number % i != 0);
    }
}