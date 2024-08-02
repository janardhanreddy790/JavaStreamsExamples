# Skip First N Elements in Stream

This example demonstrates how to skip the first N elements in a stream using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `skip` method to skip the first 2 elements.
4. We collect the remaining elements into a new list using `Collectors.toList()`.
5. Finally, we print the list after skipping the first 2 elements.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = numbers.stream()
                                              .skip(2)
                                              .collect(Collectors.toList());
        System.out.println("After skipping first 2 elements: " + skippedNumbers);
    }
}
```