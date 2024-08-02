# Find the Average of Numbers

This example demonstrates how to find the average of numbers in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream and use `mapToInt` to get an `IntStream`.
3. We use the `average` method to calculate the average.
4. We print the average if it is present.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        average.ifPresent(a -> System.out.println("Average: " + a));
    }
}
```