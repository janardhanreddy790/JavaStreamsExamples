# Find the Maximum Element in a List

This example demonstrates how to find the maximum element in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `mapToInt` to convert the stream to an `IntStream`.
4. We use `max` to find the maximum element.
5. We print the maximum element.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class MaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .max()
                         .orElse(Integer.MIN_VALUE);
        System.out.println("Max: " + max);
    }
}
```