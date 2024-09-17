package com.test.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        partASortByPriceComparator();
        partBSortByTitleComparator();
        partC();
        partD();
    }

    public static void partASortByPriceComparator() {
        System.out.println("*******************Part A********************");
        List<Product> products = getProducts();
        products.sort(new PriceComparator());
        products.forEach(System.out::println);
    }

    public static void partBSortByTitleComparator() {
        System.out.println("*******************Part B********************");
        List<Product> products = getProducts();
        products.sort(new TitleComparator());
        products.forEach(System.out::println);
    }

    public static void partC() {
        System.out.println("*******************Part C-1********************");
        List<Product> p1 = getProducts();
        ProductSorting.sort(p1, ProductSorting.ProductSortType.BY_PRICE);
        p1.forEach(System.out::println);
        System.out.println("*******************Part C-2********************");
        List<Product> p2 = getProducts();
        ProductSorting.sort(p2, ProductSorting.ProductSortType.BY_PRICE);
        p2.forEach(System.out::println);
    }

    public static void partD() {
        System.out.println("*******************Part D********************");
        List<Product> products = getProducts();
        products.sort((o1, o2) -> {
            if (o1.getTitle().equals(o2.getTitle())) {
                return Integer.compare(o1.getModel(), o2.getModel());
            } else {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        products.forEach(System.out::println);
    }

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 201));
        products.add(new Product("Smartphone", 699.99, 202));
        products.add(new Product("Smartphone", 749.99, 203));
        products.add(new Product("Smartphone", 799.99, 204));
        products.add(new Product("Headphones", 199.99, 301));
        products.add(new Product("Headphones", 159.99, 302));
        products.add(new Product("Headphones", 179.99, 303));
        products.add(new Product("Tablet", 549.99, 401));
        return products;
    }
}
