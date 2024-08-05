# Calculate the Frequency of Elements

This example demonstrates how to calculate the frequency of elements in a list using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `collect` with `Collectors.groupingBy` and `Collectors.counting` to calculate the frequency of each element.
4. We print the frequency map.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> frequency = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println("Frequency: " + frequency);
    }
}
```