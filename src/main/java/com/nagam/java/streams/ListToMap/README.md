# Create a Map from List of Keys and Values

This example demonstrates how to create a map from two lists (keys and values) using Java streams.

## Explanation

1. We create two lists: one for keys and one for values.
2. We convert the list of keys to a stream.
3. We use `Collectors.toMap` to map each key to its corresponding value based on the index.
4. Finally, we print the resulting map.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("a", "b", "c");
        List<Integer> values = Arrays.asList(1, 2, 3);
        
        Map<String, Integer> map = keys.stream()
                                       .collect(Collectors.toMap(
                                           k -> k,
                                           k -> values.get(keys.indexOf(k))
                                       ));
        System.out.println("Mapped keys to values: " + map);
    }
}
```