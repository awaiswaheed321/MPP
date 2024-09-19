package com.test.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("\n\nQuery 1: all transactions from year 2011 and sorted by value");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        // Query 2: What are all the unique cities where the traders work?
        System.out.println("\n\nQuery 2: Unique Cities: " + transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.joining(",")));

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("\n\nQuery 3: all traders from Cambridge sorted by name");
        transactions.stream()
                .map(Transaction::getTrader).distinct()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("\n\nQuery 4: All traders: " + transactions.stream().map(Transaction::getTrader).distinct()
                .sorted(comparing(Trader::getName))
                .map(Trader::getName)
                .collect(Collectors.joining(", ")));

        // Query 5: Are there any trader based in Milan?
        System.out.println("\n\nQuery 5: Trader based in Milan: " + transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("\n\nQuery 5: Updating all transaction.trader.city from Milan to Cambridge");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
                .forEach(transaction -> transaction.getTrader().setCity("Cambridge"));
        transactions.forEach(System.out::println);

        // Query 7: What's the highest value in all the transactions?
        System.out.println("\n\nQuery 7: Highest Value:" + transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::valueOf)).get());
    }
}
