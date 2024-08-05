# Convert Stream to Array

This example demonstrates how to convert a stream to an array using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `toArray` to convert the stream to an array.
4. We print the array.

## Code

```java
import java.util.Arrays;
import java.util.List;

public class StreamToArray {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript");
        String[] array = words.stream()
                              .toArray(String[]::new);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
```