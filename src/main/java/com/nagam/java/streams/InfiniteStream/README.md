# Generate Infinite Stream of Incrementing Numbers

This example demonstrates how to generate an infinite stream of incrementing numbers and limit it to the first N elements.

## Explanation

1. We use `Stream.iterate` to create an infinite stream of incrementing numbers starting from 1.
2. We limit the stream to the first 10 elements using `limit(10)`.
3. We collect the numbers into a list using `Collectors.toList()`.
4. Finally, we print the list of the first 10 numbers.

## Code

```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        List<Integer> firstTen = Stream.iterate(1, n -> n + 1)
                                       .limit(10)
                                       .collect(Collectors.toList());
        System.out.println("First 10 numbers: " + firstTen);
    }
}
```