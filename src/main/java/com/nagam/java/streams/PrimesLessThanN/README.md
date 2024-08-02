# Create a List of Primes Less Than N

This example demonstrates how to create a list of prime numbers less than a specified number using Java streams.

## Explanation

1. We specify an integer `N`.
2. We create a stream of integers from 2 to `N - 1`.
3. We filter the stream to include only prime numbers using a helper method `isPrime`.
4. We collect the prime numbers into a list using `Collectors.toList()`.
5. Finally, we print the list of prime numbers.

## Code

```java
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
```