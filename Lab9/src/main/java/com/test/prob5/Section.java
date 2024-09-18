package com.test.prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n-m+1);
	}
	
	public static void main(String[] args) {
		System.out.println("First Attempt: " + streamSection(nextStream(), 1, 3).toList());
		System.out.println("Second Attempt: " + streamSection(nextStream(), 3, 4).toList());
		System.out.println("3rd Attempt: " + streamSection(nextStream(), 2, 5).toList());
	}
	
	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
