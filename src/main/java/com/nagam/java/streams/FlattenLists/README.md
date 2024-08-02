# Flatten List of Lists

This example demonstrates how to flatten a list of lists into a single list using Java streams.

## Explanation

1. We create a list of lists, where each sub-list contains integers.
2. We convert the list of lists to a stream.
3. We use `flatMap` to flatten the stream of lists into a single stream of integers.
4. We collect the flattened elements into a new list using `Collectors.toList()`.
5. Finally, we print the flattened list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        List<Integer> flattened = listOfLists.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened);
    }
}
```