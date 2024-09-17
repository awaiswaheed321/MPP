package com.test.prob2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {
		BYTITLE, BYPRICE
	};

	public static void sort(List<Product> emps, final SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product e1, Product e2) {
				if (method == SortMethod.BYTITLE) {
					return e1.title.compareTo(e2.title);
				} else {
					return Double.compare(e1.price, e1.price);
				}
			}
		}
		Collections.sort(emps, new ProductComparator());
	}
}
