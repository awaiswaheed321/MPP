package com.test.prob4;

import java.util.Arrays;
import java.util.List;

public class prob4 {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};
        Arrays.sort(names, String::compareToIgnoreCase);
        List<String> list = List.of(names);
        list.forEach(System.out::println);
    }
}
