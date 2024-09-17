package com.test.prob2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSorting {
    enum ProductSortType {
        BY_TITLE,
        BY_PRICE
    }

    public static void sort(List<Product> products, ProductSortType sortType) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                if(sortType == ProductSortType.BY_TITLE) {
                    return p1.getTitle().compareTo(p2.getTitle());
                } else {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            }
        }
        products.sort(new ProductComparator());
    }
}
