package com.test.probB.classes;

import com.test.probB.interfaces.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck Engine Started");
    }
}
