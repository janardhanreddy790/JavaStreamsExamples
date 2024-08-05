# Calculate Frequency of Characters

This example demonstrates how to calculate the frequency of each character in a string using Java streams.

## Explanation

1. We create a string.
2. We use `chars` to get an `IntStream` of character codes.
3. We use `mapToObj` to convert each character code to a `Character`.
4. We use `Collectors.groupingBy` and `Collectors.counting` to calculate the frequency of each character.
5. We print the character frequency map.

## Code

```java
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Long> frequencyMap = str.chars()
                                               .mapToObj(c -> (char) c)
                                               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Character frequency: " + frequencyMap);
    }
}
```