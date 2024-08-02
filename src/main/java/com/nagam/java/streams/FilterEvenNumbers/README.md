# Filter Even Numbers

This example demonstrates how to filter even numbers from a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `filter` method to keep only even numbers.
4. We collect the results into a new list using `Collectors.toList()`.
5. Finally, we print the list of even numbers.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
```