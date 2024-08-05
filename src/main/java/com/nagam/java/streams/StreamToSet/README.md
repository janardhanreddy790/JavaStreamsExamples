# Convert Stream to Set

This example demonstrates how to convert a stream to a set using Java streams.

## Explanation

1. We create a stream of strings.
2. We use `collect` with `Collectors.toSet` to convert the stream to a set.
3. We print the set.

## Code

```java
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToSet {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "JavaScript");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println("Set: " + set);
    }
}
```