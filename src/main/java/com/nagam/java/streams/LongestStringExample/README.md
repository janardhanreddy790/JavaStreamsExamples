# Find the Longest String

This example demonstrates how to find the longest string in a list using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `reduce` to find the longest string by comparing the lengths of the strings.
4. We print the longest string.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class LongestStringExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "JavaScript", "Python", "C++");
        String longest = words.stream()
                              .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                              .orElse("");
        System.out.println("Longest word: " + longest);
    }
}
```