# Join Elements of a Stream

This example demonstrates how to join elements of a stream into a single string using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `collect` with `Collectors.joining` to join the elements into a single string.
4. We print the joined string.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four");
        String joined = words.stream()
                             .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
    }
}
```