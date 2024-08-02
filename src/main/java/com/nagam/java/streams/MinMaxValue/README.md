# Find Minimum and Maximum Value in List

This example demonstrates how to find the minimum and maximum values in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We use the `min` method to find the minimum value and `max` method to find the maximum value.
3. We use `Integer::compareTo` for comparison.
4. We print the minimum and maximum values if they are present.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Minimum value: " + m));
        max.ifPresent(m -> System.out.println("Maximum value: " + m));
    }
}
```
