# Calculate the Product of Numbers in a List

This example demonstrates how to calculate the product of numbers in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `reduce` to multiply all the numbers together, starting with an initial value of 1.
4. We print the product of the numbers.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product);
    }
}
```