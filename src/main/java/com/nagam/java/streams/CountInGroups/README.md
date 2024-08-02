# Count Elements in Each Group

This example demonstrates how to count the occurrences of each element in a list and group them using Java streams.

## Explanation

1. We create a list of strings with some duplicates.
2. We convert the list to a stream.
3. We use `Collectors.groupingBy` to group the elements by themselves and count their occurrences with `Collectors.counting`.
4. Finally, we print the map where keys are the elements and values are their counts.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountInGroups {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> countByWord = words.stream()
                                             .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Count of each word: " + countByWord);
    }
}
```