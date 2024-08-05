# Calculate the Sum of Squares

This example demonstrates how to calculate the sum of squares of elements in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `map` to square each element.
4. We use `reduce` to sum the squares.
5. We print the sum of squares.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n)
                                  .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
```