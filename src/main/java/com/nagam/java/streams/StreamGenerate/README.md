# Generate with Streams

This example demonstrates how to use `Stream.generate` to generate a stream of random numbers using Java streams.

## Explanation

1. We use `Stream.generate` to create an infinite stream of random numbers.
2. We use `limit` to limit the stream to 5 elements.
3. We use `forEach` to print each element.

## Code

```java
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        Stream.generate(Math::random)
              .limit(5)
              .forEach(System.out::println);
    }
}
```