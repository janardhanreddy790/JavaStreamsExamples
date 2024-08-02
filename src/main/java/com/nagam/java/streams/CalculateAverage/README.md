# Calculate Average of List Elements

This example demonstrates how to calculate the average of all elements in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `mapToInt` method to convert each element of the stream to an `int`.
4. We calculate the average using the `average` method.
5. We print the average, using `orElse` to provide a default value if the list is empty.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class CalculateAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0);
        System.out.println("Average of elements: " + average);
    }
}
```
