package com.test.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************Problem 1**************************");
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("grape");
        words.add("berry");
        System.out.println("List: " + words);
        System.out.println("Length 5, Contains A, Contains no e -> Count: " + countWords(words, 'e', 'a', 5));
        System.out.println("Length 5, Contains e, Contains no r -> Count: " + countWords(words, 'a', 'z', 5));
    }

    public static Long countWords(List<String> words, char c, char d, int len) {
        Function<Character, String> exp = String::valueOf;
        return words.stream()
                .filter(x -> x.length() == len)
                .filter(x -> x.contains(exp.apply(c)))
                .filter(x -> !x.contains(exp.apply(d)))
                .count();
    }
}
