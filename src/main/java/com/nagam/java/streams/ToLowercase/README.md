# Convert a List of Strings to Lowercase

This example demonstrates how to convert a list of strings to lowercase using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `map` to apply the `toLowerCase` method to each string.
4. We use `collect` with `Collectors.toList` to collect the results into a new list.
5. We print the list of lowercase words.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("HELLO", "WORLD");
        List<String> lowercaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase words: " + lowercaseWords);
    }
}
```