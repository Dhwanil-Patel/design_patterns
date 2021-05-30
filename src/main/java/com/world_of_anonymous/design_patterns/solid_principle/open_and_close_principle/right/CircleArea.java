package com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.right;

import java.awt.geom.Area;

public class CircleArea implements Shape {

    double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (2 * 3.14) * radius * radius;
    }
}
