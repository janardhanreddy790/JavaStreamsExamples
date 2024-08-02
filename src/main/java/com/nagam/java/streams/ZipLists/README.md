# Zip Two Lists into Pairs

This example demonstrates how to zip two lists into pairs using Java streams.

## Explanation

1. We create two lists of strings and integers.
2. We use `IntStream.range` to create a stream of indices.
3. For each index, we create a string pair from both lists.
4. We collect the pairs into a new list using `Collectors.toList()`.
5. Finally, we print the list of pairs.

## Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZipLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        
        List<String> zipped = IntStream.range(0, Math.min(list1.size(), list2.size()))
                                       .mapToObj(i -> list1.get(i) + "-" + list2.get(i))
                                       .collect(Collectors.toList());
        
        System.out.println("Zipped lists: " + zipped);
    }
}
```