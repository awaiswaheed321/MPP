package com.test.prob2.classes;

import com.test.prob2.interfaces.ClosedCurve;

public class Circle implements ClosedCurve {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }
}
