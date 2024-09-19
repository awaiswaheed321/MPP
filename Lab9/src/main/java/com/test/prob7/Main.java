package com.test.prob7;

import java.util.*;
import java.util.function.Predicate;
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

		Predicate<Employee> salaryFilter = e -> e.getSalary() > 100000;
		Predicate<Employee> lastNameFilter = input -> !input.getLastName().isEmpty() && input.getLastName().toUpperCase().charAt(0) >= 'N' && input.getLastName().toUpperCase().charAt(0) <= 'Z';
		
		//your stream pipeline here
		String result = list.stream()
				.filter(salaryFilter)
				.filter(lastNameFilter)
				.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.map(Employee::getFullName)
				.collect(Collectors.joining(", "));
		System.out.println(result);
	}

}
