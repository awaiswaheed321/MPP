package com.test.prob6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Set<String>> listOfSets = new ArrayList<>();
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("dog", "cat", "rabbit"));
        Set<String> set3 = new HashSet<>(Arrays.asList("car", "bike", "bus"));
        listOfSets.add(set1);
        listOfSets.add(set2);
        listOfSets.add(set3);

        Set<String> result = union(listOfSets);
        result.forEach(System.out::println);
    }

    public static Set<String> union(List<Set<String>> sets) {
        return sets.stream().flatMap(Collection::stream).collect(Collectors.toUnmodifiableSet());
    }
}
