package com.nagam.java.streams.CharacterFrequency;

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