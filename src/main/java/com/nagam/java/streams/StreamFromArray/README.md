# Create a Stream from an Array

This example demonstrates how to create a stream from an array using Java streams.

## Explanation

1. We create an array of strings.
2. We use `Arrays.stream` to create a stream from the array.
3. We use `forEach` to print each element in the stream.

## Code

```java
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "JavaScript"};
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}
```