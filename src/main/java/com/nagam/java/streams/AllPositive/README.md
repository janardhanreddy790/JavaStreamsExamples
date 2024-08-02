# Check if All Numbers are Positive

This example demonstrates how to check if all numbers in a list are positive using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `allMatch` to check if all elements in the stream are greater than 0.
4. Finally, we print whether all numbers are positive.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class AllPositive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean allPositive = numbers.stream()
                                     .allMatch(n -> n > 0);
        System.out.println("All numbers are positive: " + allPositive);
    }
}
```