# Find the Minimum Element in a List

This example demonstrates how to find the minimum element in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `mapToInt` to convert the stream to an `IntStream`.
4. We use `min` to find the minimum element.
5. We print the minimum element.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int min = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .min()
                         .orElse(Integer.MAX_VALUE);
        System.out.println("Min: " + min);
    }
}
```