package com.test.probC.classes;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<Order>();
    }

    void addOrder(Order order) {
        this.orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", orders=" + orders.toString() +
                '}';
    }
}
