# Sort List of Custom Objects by Multiple Fields

This example demonstrates how to sort a list of custom objects by multiple fields using Java streams.

## Explanation

1. We define a `Person` class with `name` and `age` fields.
2. We create a list of `Person` objects.
3. We convert the list to a stream.
4. We use `sorted` with a comparator that sorts by name and then by age.
5. We collect the sorted stream into a new list using `Collectors.toList()`.
6. We print each `Person` in the sorted list.

## Code

```java
package com.nagam.java.streams.MultiFieldSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultiFieldSort {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 30),
                new Person("Jane", 25),
                new Person("John", 25),
                new Person("Alice", 30)
        );
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Person::getAge))
                .collect(Collectors.toList());
        sortedPeople.forEach(System.out::println);
    }
}
```