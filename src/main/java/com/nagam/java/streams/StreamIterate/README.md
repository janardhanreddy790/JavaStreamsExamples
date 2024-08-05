# Iterate with Streams

This example demonstrates how to use `Stream.iterate` to generate a sequence of even numbers using Java streams.

## Explanation

1. We use `Stream.iterate` to generate an infinite stream starting from 0, with each subsequent element being 2 greater than the previous one.
2. We use `limit` to limit the stream to the first 10 elements.
3. We use `forEach` to print each element.

## Code

```java
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
              .limit(10)
              .forEach(System.out::println);
    }
}
```