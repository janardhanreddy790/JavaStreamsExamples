# Partition List into Even and Odd Numbers

This example demonstrates how to partition a list into even and odd numbers using Java streams.

## Explanation

1. We create a list of integers.
2. We convert the list to a stream.
3. We use `Collectors.partitioningBy` to partition the elements based on whether they are even or odd.
4. Finally, we print the map where the key `true` corresponds to even numbers and `false` to odd numbers.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                         .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned by even and odd: " + partitioned);
    }
}
```