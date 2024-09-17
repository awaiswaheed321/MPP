package com.test.prob3.interfaces;

public interface CustomerInterface {
    default boolean isLoyaltyCustomer(int loyaltyPoints) {
        return loyaltyPoints > 50;
    }

    String getCustomerName();

    int getLoyaltyPoints();
}
