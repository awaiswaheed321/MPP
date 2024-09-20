package com.test.prob7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        //your stream pipeline here
        String result = list.stream()
                .filter(e -> e.getSalary() > 100000)
                .filter(input -> !input.getLastName().isEmpty() && input.getLastName().toUpperCase().charAt(0) >= 'N' && input.getLastName().toUpperCase().charAt(0) <= 'Z')
                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.joining(", "));
        System.out.println("Prob A: Using Stream Pipeline: " + result);

        List<Employee> res = LambdaLibrary.getSalaryGreaterThanFilter.apply(list, 100000);
        res = LambdaLibrary.lastNAmeInBetweenFilter.apply(res, 'N', 'Z');
        res = LambdaLibrary.sortedByName.apply(res);
        String result1 = LambdaLibrary.nameMapper.apply(res);
        System.out.println("Prob B: Using Lambda Library: " + result1);
    }

}
