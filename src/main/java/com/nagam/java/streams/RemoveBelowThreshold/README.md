# Remove Elements Less Than a Threshold

This example demonstrates how to filter out elements in a list that are below a certain threshold using Java streams.

## Explanation

1. We create a list of integers and define a threshold.
2. We convert the list to a stream.
3. We use the `filter` method to keep only elements greater than or equal to the threshold.
4. We collect the filtered elements into a new list using `Collectors.toList()`.
5. Finally, we print the filtered list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveBelowThreshold {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 2, 9);
        int threshold = 5;
        List<Integer> filtered = numbers.stream()
                                        .filter(n -> n >= threshold)
                                        .collect(Collectors.toList());
        System.out.println("Numbers greater than or equal to " + threshold + ": " + filtered);
    }
}
```