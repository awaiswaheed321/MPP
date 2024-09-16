package com.test.prob2.classes;

import com.test.prob2.interfaces.Polygon;

import java.util.List;

public class Rectangle implements Polygon {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public List<Double> getLengths() {
        return List.of(length, width, length, width);
    }
}
