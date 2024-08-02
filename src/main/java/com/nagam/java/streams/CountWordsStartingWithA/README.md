# Count Words Starting with 'A'

This example demonstrates how to count the number of words in a list that start with the letter 'A' using Java streams.

## Explanation

1. We create a list of words.
2. We convert the list to a stream.
3. We use the `filter` method to keep only words starting with 'A'.
4. We count the filtered words using the `count` method.
5. Finally, we print the count of words starting with 'A'.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class CountWordsStartingWithA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "blueberry");
        long count = words.stream()
                          .filter(word -> word.startsWith("a"))
                          .count();
        System.out.println("Number of words starting with 'A': " + count);
    }
}
```