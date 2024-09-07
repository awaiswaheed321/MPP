package com.test.probB;

import com.test.probB.classes.Bus;
import com.test.probB.classes.Car;
import com.test.probB.classes.ElectricCar;
import com.test.probB.classes.Truck;
import com.test.probB.enums.VehicleType;
import com.test.probB.interfaces.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        try {
            VehicleType vehicleType = VehicleType.valueOf(type.toUpperCase());
            return switch (vehicleType) {
                case CAR -> new Car();
                case TRUCK -> new Truck();
                case BUS -> new Bus();
                case ELECTRIC_CAR -> new ElectricCar();
            };
        } catch (IllegalArgumentException e) {
            // Handle the case when 'type' is not a valid VehicleType
            System.out.println("Invalid vehicle type: " + type);
            return null;
        }
    }
}
