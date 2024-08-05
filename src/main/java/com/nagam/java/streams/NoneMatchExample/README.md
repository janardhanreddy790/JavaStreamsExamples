# Check if No Element Matches a Condition

This example demonstrates how to check if no element in a list matches a given condition using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `noneMatch` to check if no element in the stream is even.
4. We print the result.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        boolean noneEven = numbers.stream()
                                  .noneMatch(n -> n % 2 == 0);
        System.out.println("No number is even: " + noneEven);
    }
}
```