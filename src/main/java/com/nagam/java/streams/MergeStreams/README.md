# Merge Two Streams

This example demonstrates how to merge two streams into a single stream using Java streams.

## Explanation

1. We create two lists of integers.
2. We convert both lists to streams.
3. We use `Stream.concat` to merge the two streams into one.
4. We collect the merged stream into a new list using `Collectors.toList()`.
5. Finally, we print the merged list.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        
        List<Integer> merged = Stream.concat(list1.stream(), list2.stream())
                                     .collect(Collectors.toList());
        System.out.println("Merged list: " + merged);
    }
}
```