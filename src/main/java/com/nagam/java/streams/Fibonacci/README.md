# Create a List of Fibonacci Numbers

This example demonstrates how to create a list of Fibonacci numbers using Java streams.

## Explanation

1. We use `Stream.iterate` to generate Fibonacci numbers. Each element is a pair of integers representing the current and next Fibonacci numbers.
2. We limit the stream to 10 elements.
3. We map each pair to the first element (current Fibonacci number).
4. We collect the Fibonacci numbers into a list using `Collectors.toList()`.
5. Finally, we print the list of Fibonacci numbers.

## Code

```java
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
```