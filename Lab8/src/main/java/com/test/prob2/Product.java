package com.test.prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product {
    final String title;
    final double price;
    final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Pineapple", 4.0, 4),
                new Product("Apple", 20.0, 1),
                new Product("Banana", 12.0, 4),
                new Product("Banana", 12.0, 2),
                new Product("Orange", 1.0, 3),
                new Product("Grapes", 2.0, 5));

        // Prob 2 - a. Sort the products by price
        products.sort(new PriceComparator());

        products.forEach(x -> System.out.println(x));

        System.out.println("\n\n");

        // Prob 2 - b. Sort the products by title
        Collections.sort(products, new TitleComparator());

        products.forEach(x -> System.out.println(x));

        System.out.println("\n\n");

        // Prob 2 - c. Implement the sort method so that only one type of Comparator is
        // used for // tasks a & b by referring comparator3 package
        ProductInfo.sort(products, ProductInfo.SortMethod.BYTITLE);
        products.forEach(x -> System.out.println(x));

        System.out.println("\n\n");

        ProductInfo.sort(products, ProductInfo.SortMethod.BYPRICE);
        products.forEach(x -> System.out.println(x));

        System.out.println("\n\n");

        // Prob 2 - d. If the title is the same, use the model as another attribute to
        // sort it.
        Collections.sort(products, (p1, p2) -> {
            if (p1.getTitle().equals(p2.getTitle())) {
                return Integer.compare(p1.getModel(), p2.getModel());
            }
            return p1.getTitle().compareTo(p2.getTitle());
        });
        products.forEach(x -> System.out.println(x));
    }

}
