# Generate a Stream of Prime Numbers

This example demonstrates how to generate a stream of prime numbers using Java streams.

## Explanation

1. We use `Stream.iterate` to generate a stream of prime numbers.
2. We use `limit` to get the first 10 prime numbers.
3. We use `forEach` to print each prime number.
4. We define a method `nextPrime` to find the next prime number after a given number.
5. We define a method `isPrime` to check if a number is prime.

## Code

```java
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
```