# Sum of List Elements

This example demonstrates how to calculate the sum of all elements in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `mapToInt` method to convert each element of the stream to an `int`.
4. We sum the elements using the `sum` method.
5. Finally, we print the sum.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum of elements: " + sum);
    }
}
```
