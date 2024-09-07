package com.test.probC.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

    Order() {
        orderDate = LocalDate.now();
        items = new ArrayList<>();
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", items=" + items.toString() +
                '}';
    }
}
