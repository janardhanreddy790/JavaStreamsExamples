# FlatMap Example

This example demonstrates how to use `flatMap` to flatten a list of lists into a single list using Java streams.

## Explanation

1. We create a list of lists of strings.
2. We convert the outer list to a stream.
3. We use `flatMap` to flatten the lists into a single stream.
4. We use `collect` with `Collectors.toList` to collect the results into a single list.
5. We print the flattened list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e"),
            Arrays.asList("f", "g", "h")
        );
        List<String> flatList = listOfLists.stream()
                                           .flatMap(List::stream)
                                           .collect(Collectors.toList());
        System.out.println("Flat list: " + flatList);
    }
}
```