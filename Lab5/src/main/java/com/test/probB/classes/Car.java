package com.test.probB.classes;

import com.test.probB.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car Engine Started");
    }
}
