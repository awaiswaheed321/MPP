package com.test.probB.classes;

import com.test.probB.interfaces.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bus Engine Started");
    }
}
