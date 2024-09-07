package com.test.probB;

import com.test.probB.enums.VehicleType;
import com.test.probB.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
        for (VehicleType v : VehicleType.values()) {
            Vehicle vehicle = VehicleFactory.getVehicle(v.toString());
            if (vehicle != null) {
                vehicle.startEngine();
            }
        }
    }
}
