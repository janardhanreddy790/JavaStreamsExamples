# Find Second Largest Element

This example demonstrates how to find the second largest element in a list using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We sort the stream in descending order using `Comparator.reverseOrder()`.
4. We skip the first element (the largest) and get the next element.
5. We print the second largest element if it is present.

## Code

```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 7, 3);
        Optional<Integer> secondLargest = numbers.stream()
                                                 .sorted(Comparator.reverseOrder())
                                                 .skip(1)
                                                 .findFirst();
        secondLargest.ifPresent(s -> System.out.println("Second largest element: " + s));
    }
}
```