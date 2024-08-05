# Convert a Stream to a Map

This example demonstrates how to convert a stream to a map using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `collect` with `Collectors.toMap` to convert the stream to a map where the key is the string and the value is the length of the string.
4. We print the map.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> map = words.stream()
                                        .collect(Collectors.toMap(word -> word, word -> word.length()));
        System.out.println("Map: " + map);
    }
}
```