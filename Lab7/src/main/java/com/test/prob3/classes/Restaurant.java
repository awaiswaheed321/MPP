package com.test.prob3.classes;

import com.test.prob3.interfaces.RestaurantInterface;

public class Restaurant implements RestaurantInterface {
    private String restaurantName;
    private double baseDeliveryCharges;
    private double locationDistance;

    public Restaurant(String restaurantName, Double baseDeliveryCharges, Double locationDistance) {
        this.restaurantName = restaurantName;
        this.baseDeliveryCharges = baseDeliveryCharges;
        this.locationDistance = locationDistance;
    }

    public Restaurant() {
    }


    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }

    @Override
    public Double calculateDeliveryCost() {
        return baseDeliveryCharges + (locationDistance * 0.05);
    }
}
