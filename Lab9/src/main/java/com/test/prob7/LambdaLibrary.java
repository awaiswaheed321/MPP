package com.test.prob7;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLibrary {
    public static Predicate<Employee> getSalaryGreaterThanFilter(Integer salary) {
        return e -> e.getSalary() > salary;
    }

    public static Predicate<Employee> lastNameStartsInBetweenFilter(Character c1, Character c2) {
        return input -> !input.getLastName().isEmpty() && input.getLastName().toUpperCase().charAt(0) >= c1 && input.getLastName().toUpperCase().charAt(0) <= c2;
    }

    public static Function<Employee, String> nameMapper() {
        return e -> e.getFirstName() + " " + e.getLastName();
    }
}
