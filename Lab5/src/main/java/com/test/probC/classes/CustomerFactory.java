package com.test.probC.classes;

public class CustomerFactory {
    public static void addItem(Order order, String name) {
        order.addItem(new Item(name));
    }

    public static Order createOrder(Customer customer) {
        Order order = new Order();
        customer.addOrder(order);
        return order;
    }

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }
}
