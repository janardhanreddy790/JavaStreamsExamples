# Check If Any Element Matches a Predicate

This example demonstrates how to check if any element in a list matches a given predicate using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `anyMatch` to check if any element matches the condition (in this case, if it is even).
4. Finally, we print whether any such element exists.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Contains an even number: " + hasEven);
    }
}
```