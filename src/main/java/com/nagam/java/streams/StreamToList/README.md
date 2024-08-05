# Convert Stream to List

This example demonstrates how to convert a stream to a list using Java streams.

## Explanation

1. We create a stream of strings.
2. We use `collect` with `Collectors.toList` to convert the stream to a list.
3. We print the list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "JavaScript");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println("List: " + list);
    }
}
```