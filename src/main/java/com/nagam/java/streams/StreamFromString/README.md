# Create a Stream from a String

This example demonstrates how to create a stream from a string using Java streams.

## Explanation

1. We create a string.
2. We use `chars` to get an `IntStream` of character codes.
3. We use `mapToObj` to convert each character code to a `Character`.
4. We use `forEach` to print each character.

## Code

```java
import java.util.stream.Stream;

public class StreamFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        Stream<Character> characterStream = str.chars().mapToObj(c -> (char) c);
        characterStream.forEach(System.out::println);
    }
}
```