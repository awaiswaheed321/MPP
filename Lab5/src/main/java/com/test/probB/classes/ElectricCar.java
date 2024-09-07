package com.test.probB.classes;

import com.test.probB.interfaces.Vehicle;

public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Electric Car Engine Started");
    }
}
