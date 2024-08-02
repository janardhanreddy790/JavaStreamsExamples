# Check if No Number is Zero

This example demonstrates how to check if no number in a list is zero using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `noneMatch` to check if no element in the stream is equal to 0.
4. Finally, we print whether no number is zero.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class NoneZero {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean noneZero = numbers.stream()
                                  .noneMatch(n -> n == 0);
        System.out.println("No number is zero: " + noneZero);
    }
}
```