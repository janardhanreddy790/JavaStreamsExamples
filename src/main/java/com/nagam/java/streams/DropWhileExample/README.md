# Use of DropWhile in Streams

This example demonstrates how to use the `dropWhile` method to drop elements from a stream until a condition is met.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `dropWhile` to drop elements from the stream until the condition `n < 4` is no longer met.
4. We collect the remaining elements into a new list.
5. We print the result.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class DropWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
                                      .dropWhile(n -> n < 4)
                                      .collect(Collectors.toList());
        System.out.println("Result after dropWhile: " + result);
    }
}
```