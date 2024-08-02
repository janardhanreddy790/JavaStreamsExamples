# Filter and Sort a List of Strings

This example demonstrates how to filter and sort a list of strings using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `filter` to include only the strings that start with the letter 'b'.
4. We use `sorted` to sort the filtered strings.
5. We collect the filtered and sorted strings into a list using `Collectors.toList()`.
6. Finally, we print the result.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "blueberry");
        List<String> filteredSorted = words.stream()
                                           .filter(w -> w.startsWith("b"))
                                           .sorted()
                                           .collect(Collectors.toList());
        System.out.println("Filtered and sorted list: " + filteredSorted);
    }
}
```