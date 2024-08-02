# Group Strings by Length

This example demonstrates how to group strings by their length using Java streams.

## Explanation

1. We create a list of strings.
2. We convert the list to a stream.
3. We use `Collectors.groupingBy` to group the strings by their length.
4. Finally, we print the map where the keys are lengths and the values are lists of strings of that length.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words =
```