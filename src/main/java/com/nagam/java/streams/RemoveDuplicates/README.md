# Remove Duplicates from List

This example demonstrates how to remove duplicates from a list using Java streams.

## Explanation

1. We create a list of integers with some duplicate elements.
2. We convert the list to a stream.
3. We use the `distinct` method to remove duplicate elements.
4. We collect the unique elements into a new list using `Collectors.toList()`.
5. Finally, we print the list without duplicates.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()
                                             .collect(Collectors.toList());
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
```