package com.test.prob2.interfaces;

import java.util.List;

public interface Polygon extends ClosedCurve {
    @Override
    default double computePerimeter() {
        List<Double> sides = getLengths();
        return sides.stream().mapToDouble(Double::doubleValue).sum();
    }

    List<Double> getLengths();
}
