package com.test.prob2;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        Stream.iterate(1, n -> n + 1)
                .map(n -> n * n)
                .limit(num)
                .forEach(System.out::println);
    }
}
