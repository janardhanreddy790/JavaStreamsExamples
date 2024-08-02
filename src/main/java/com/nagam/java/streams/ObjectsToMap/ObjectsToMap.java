package com.nagam.java.streams.ObjectsToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

public class ObjectsToMap {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        Map<String, Integer> nameToAgeMap = people.stream()
                                                  .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("Name to Age Map: " + nameToAgeMap);
    }
}