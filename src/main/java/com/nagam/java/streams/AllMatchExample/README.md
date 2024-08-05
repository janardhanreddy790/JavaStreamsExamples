# Check if All Elements Match a Condition

This example demonstrates how to check if all elements in a list match a given condition using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `allMatch` to check if all elements in the stream are even.
4. We print the result.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream()
                                 .allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);
    }
}
```
