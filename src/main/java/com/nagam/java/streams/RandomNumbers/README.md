# Generate List of Random Numbers

This example demonstrates how to generate a list of random numbers using Java streams.

## Explanation

1. We use `IntStream.range(0, 10)` to create a stream of 10 integers.
2. We map each integer to a random number between 0 and 100.
3. We convert the stream of integers to a stream of boxed integers.
4. We collect the integers into a list using `Collectors.toList()`.
5. Finally, we print the list of random numbers.

## Code

```java
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
```