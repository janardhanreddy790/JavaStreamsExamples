# Square Each Number in List

This example demonstrates how to square each number in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `map` method to square each element in the stream.
4. We collect the squared elements into a new list using `Collectors.toList()`.
5. Finally, we print the list of squared numbers.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
```