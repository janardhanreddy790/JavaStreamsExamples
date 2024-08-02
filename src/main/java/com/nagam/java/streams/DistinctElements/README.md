# Find Distinct Elements in List

This example demonstrates how to find distinct elements in a list using Java streams.

## Explanation

1. We create a list of integers with some duplicate elements.
2. We convert the list to a stream.
3. We use the `distinct` method to filter out duplicate elements.
4. We collect the distinct elements into a new list using `Collectors.toList()`.
5. Finally, we print the list of distinct elements.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println("Distinct elements: " + distinctNumbers);
    }
}
```