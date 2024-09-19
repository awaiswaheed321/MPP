package com.test.prob1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Orange", "Cherry", "Pineapple");
        System.out.println(countWords(list, 'p', 'n', 5));
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(String.valueOf(c)))
                .filter(word -> !word.contains(String.valueOf(d)))
                .count();
    }
}
