# Limit Stream to First N Elements

This example demonstrates how to limit a stream to the first N elements using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `limit` method to get only the first 3 elements.
4. We collect the limited elements into a new list using `Collectors.toList()`.
5. Finally, we print the limited list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(3)
                                              .collect(Collectors.toList());
        System.out.println("Limited to first 3 elements: " + limitedNumbers);
    }
}
```