# Concatenate Two Streams

This example demonstrates how to concatenate two streams into a single stream using Java streams.

## Explanation

1. We create two lists of strings.
2. We convert both lists to streams.
3. We use `Stream.concat` to concatenate the two streams.
4. We collect the concatenated stream into a new list using `Collectors.toList()`.
5. We print the concatenated list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "Python");
        List<String> list2 = Arrays.asList("JavaScript", "C++");
        List<String> concatenated = Stream.concat(list1.stream(), list2.stream())
                                          .collect(Collectors.toList());
        System.out.println("Concatenated list: " + concatenated);
    }
}
```