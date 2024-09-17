package com.test.prob3;

import com.test.prob3.classes.Customer;
import com.test.prob3.classes.Restaurant;
import com.test.prob3.interfaces.RestaurantInterface;

import java.util.ArrayList;
import java.util.Random;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
        restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
        restaurants.add(new Restaurant("Burger World", 4.0, 7.5));
        // Create an ArrayList of Customers
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", 60));
        customers.add(new Customer("Jane Smith", 40));
        customers.add(new Customer("Bob Johnson", 80));

        restaurants.forEach(restaurant -> {
            customers.forEach(customer -> {
                double orderAmount = generateRandomOrderAmount();
                double discount = restaurant.calculateDiscount(orderAmount);
                double priceAfterDiscount = orderAmount - discount;
                RestaurantInterface.printFormattedDate(restaurant.getRestaurantName(), customer.getCustomerName(), orderAmount,
                        restaurant.calculateDeliveryCost(), discount, priceAfterDiscount, customer.isLoyaltyCustomer(customer.getLoyaltyPoints()));
            });
        });
    }

    public static double generateRandomOrderAmount() {
        Random random = new Random();
        // Generates a random double between 50 and 200
        return 50 + (150 * random.nextDouble());
    }
}
