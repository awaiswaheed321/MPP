package com.test.prob7;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static BiFunction<List<Employee>, Integer, List<Employee>> getSalaryGreaterThanFilter =
            (employees, salary) -> employees.stream().filter(emp -> emp.getSalary() > salary).collect(Collectors.toList());

    public static TriFunction<List<Employee>, Character, Character, List<Employee>> lastNAmeInBetweenFilter = (employees, character, character2) ->
            employees.stream().filter(input -> !input.getLastName().isEmpty() &&
                            input.getLastName().toUpperCase().charAt(0) >= character &&
                            input.getLastName().toUpperCase().charAt(0) <= character2)
                    .collect(Collectors.toList());

    public static Function<List<Employee>, String> nameMapper = employees -> employees.stream()
            .map(e -> e.getFirstName() + " " + e.getLastName()).collect(Collectors.joining(", "));

    public static Function<List<Employee>, List<Employee>> sortedByName =
            employees -> employees.stream()
                    .sorted(Comparator.comparing(Employee::getFirstName)
                            .thenComparing(Employee::getLastName))
                    .collect(Collectors.toList());
}
