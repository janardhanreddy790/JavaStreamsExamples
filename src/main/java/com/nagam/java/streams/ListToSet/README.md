# Collect List Elements into Set

This example demonstrates how to collect elements of a list into a set using Java streams.

## Explanation

1. We create a list of integers with some duplicate elements.
2. We convert the list to a stream.
3. We collect the elements into a set using `Collectors.toSet()`, which removes duplicates.
4. Finally, we print the set of elements.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2);
        Set<Integer> numberSet = numbers.stream()
                                        .collect(Collectors.toSet());
        System.out.println("Set of elements: " + numberSet);
    }
}
```
