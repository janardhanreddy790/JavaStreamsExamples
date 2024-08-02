# Concatenate Strings with Comma

This example demonstrates how to concatenate strings in a list with a comma separator using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `Collectors.joining(", ")` to concatenate the strings with a comma separator.
4. Finally, we print the concatenated string.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String result = strings.stream()
                               .collect(Collectors.joining(", "));
        System.out.println("Concatenated String: " + result);
    }
}
```