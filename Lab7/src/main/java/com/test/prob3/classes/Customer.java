package com.test.prob3.classes;

import com.test.prob3.interfaces.CustomerInterface;

public class Customer implements CustomerInterface {
    String customerName;
    int loyaltyPoints;

    public Customer(String customerName, int loyaltyPoints) {
        this.customerName = customerName;
        this.loyaltyPoints = loyaltyPoints;
    }

    public Customer() {
    }


    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public int getLoyaltyPoints() {
        return this.loyaltyPoints;
    }
}
