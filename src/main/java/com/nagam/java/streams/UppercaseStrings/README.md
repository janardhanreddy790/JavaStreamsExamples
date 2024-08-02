# Convert List of Strings to Uppercase

This example demonstrates how to convert all strings in a list to uppercase using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use the `map` method to convert each string to uppercase.
4. We collect the results into a new list using `toList()`.
5. Finally, we print the list of uppercase strings.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .toList();
        System.out.println("Uppercase Strings: " + uppercaseStrings);
    }
}
```