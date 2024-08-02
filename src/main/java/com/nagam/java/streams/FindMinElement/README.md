# Find Minimum Element

This example demonstrates how to find the minimum element in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `min` method to find the minimum element.
4. We print the minimum element if it is present.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        Optional<Integer> minElement = numbers.stream()
                                              .min(Integer::compareTo);
        minElement.ifPresent(min -> System.out.println("Minimum element: " + min));
    }
}
```