# Sort List in Ascending Order

This example demonstrates how to sort a list in ascending order using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use the `sorted` method to sort the elements in ascending order.
4. We collect the sorted elements into a new list using `Collectors.toList()`.
5. Finally, we print the sorted list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 7);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted in ascending order: " + sortedNumbers);
    }
}
```