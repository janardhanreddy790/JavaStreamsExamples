# Find Maximum Element

This example demonstrates how to find the maximum element in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `max` method to find the maximum element.
4. We print the maximum element if it is present.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        Optional<Integer> maxElement = numbers.stream()
                                              .max(Integer::compareTo);
        maxElement.ifPresent(max -> System.out.println("Maximum element: " + max));
    }
}
```