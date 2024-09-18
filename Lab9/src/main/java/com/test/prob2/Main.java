package com.test.prob2;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************Problem 2**************************");
        printSquares(5);
        printSquares(10);
    }

    public static void printSquares(int num) {
        System.out.println("Printing " + num + " squares...");
        IntStream.iterate(1, n -> n + 1).
                limit(num)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
