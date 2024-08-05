# Count Elements in a Stream

This example demonstrates how to count the number of elements in a stream using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `count` to count the number of elements in the stream.
4. We print the count.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four");
        long count = words.stream()
                          .count();
        System.out.println("Count: " + count);
    }
}
```