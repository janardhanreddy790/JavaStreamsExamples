# Convert List of Strings to Uppercase

This example demonstrates how to convert a list of strings to uppercase using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use the `map` method to convert each string to uppercase.
4. We collect the uppercased strings into a new list using `Collectors.toList()`.
5. Finally, we print the list of uppercased words.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercasedWords = words.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Uppercased words: " + uppercasedWords);
    }
}
```