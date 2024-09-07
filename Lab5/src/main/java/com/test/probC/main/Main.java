package com.test.probC.main;

import com.test.probC.classes.Customer;
import com.test.probC.classes.CustomerFactory;
import com.test.probC.classes.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.createCustomer("Bob");
        Order order = CustomerFactory.createOrder(customer);
        CustomerFactory.addItem(order, "Shirt");
        CustomerFactory.addItem(order, "Laptop");

        Order order2 = CustomerFactory.createOrder(customer);
        CustomerFactory.addItem(order2, "knives");
        CustomerFactory.addItem(order2, "spoons");

        System.out.println(customer.toString());
    }
}
