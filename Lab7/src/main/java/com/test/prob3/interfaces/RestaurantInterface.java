package com.test.prob3.interfaces;

public interface RestaurantInterface {
    String getRestaurantName();

    Double calculateDeliveryCost();

    default double calculateDiscount(double totalOrderAmount) {
        return totalOrderAmount > 100 ? totalOrderAmount * 0.05 : 0;
    }

    static void printFormattedDate(String restaurantName, String customerName, double orderAmount,
                                   double deliveryCharges, double discount, double totalAfterDiscount, boolean loyalCustomer) {
        System.out.println("**********************************************************************");
        System.out.println("Processing order for Customer: " + customerName + " at Restaurant: " + restaurantName);
        if (loyalCustomer) {
            System.out.println("Customer Loyalty Status: Loyal Customer");
        } else {
            System.out.println("Customer Loyalty Status: New Customer");
        }
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Customer: " + customerName);
        System.out.printf("Order Amount: $%.2f%n", orderAmount);
        System.out.printf("Delivery Charge: $%.2f%n", deliveryCharges);
        System.out.printf("Discount Applied: $%.2f%n", discount);
        System.out.printf("Total after Discount: $%.2f%n", totalAfterDiscount);
    }
}
