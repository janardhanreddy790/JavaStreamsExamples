package com.nagam.java.streams.ListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("a", "b", "c");
        List<Integer> values = Arrays.asList(1, 2, 3);
        
        Map<String, Integer> map = keys.stream()
                                       .collect(Collectors.toMap(
                                           k -> k,
                                           k -> values.get(keys.indexOf(k))
                                       ));
        System.out.println("Mapped keys to values: " + map);
    }
}