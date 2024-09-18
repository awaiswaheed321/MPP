package com.test.prob4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Maral", "Alexis", "Tim", "Kyleen", "KRISTY" };
        Arrays.sort(names, String::compareToIgnoreCase);
        List<String> list = Arrays.stream(names).toList();
        list.forEach(System.out::println);
    }
}
