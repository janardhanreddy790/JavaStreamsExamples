# Check if Any Number is Negative

This example demonstrates how to check if any number in a list is negative using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `anyMatch` to check if any element in the stream is less than 0.
4. Finally, we print whether any number is negative.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class AnyNegative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, 4, 5);
        boolean anyNegative = numbers.stream()
                                     .anyMatch(n -> n < 0);
        System.out.println("Any number is negative: " + anyNegative);
    }
}
```