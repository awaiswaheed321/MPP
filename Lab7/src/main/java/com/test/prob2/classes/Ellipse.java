package com.test.prob2.classes;

import com.test.prob2.interfaces.ClosedCurve;

public class Ellipse implements ClosedCurve {
    private double semiAxis;
    private double eLateral;

    public Ellipse(double semiAxis, double eLateral) {
        this.semiAxis = semiAxis;
        this.eLateral = eLateral;
    }

    public Ellipse() {
    }

    public double getSemiAxis() {
        return semiAxis;
    }

    public void setSemiAxis(double semiAxis) {
        this.semiAxis = semiAxis;
    }

    public double getELateral() {
        return eLateral;
    }

    public void setELateral(double eLateral) {
        this.eLateral = eLateral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiAxis * eLateral;
    }
}
