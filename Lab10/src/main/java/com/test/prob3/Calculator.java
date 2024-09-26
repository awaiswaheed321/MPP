package com.test.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Sum of Ints : " + sum(Arrays.asList(1,2,3)));
		System.out.println("Sum of Doubles : " +sum(Arrays.asList(1.5,2.5,3.5)));
		

	}
	
	// Wild card with upper bound
	public static double sum(List<? extends Number> list){
		double temp= 0.0;
		for(Number num : list){
			temp = temp + num.doubleValue();
		}
		return temp;
		
	}
	
}
