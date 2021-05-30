package com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.right;

import com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.wrong.AreaCalculator;

public class RectangleArea implements Shape {

    private double height;
    private double width;

    public RectangleArea(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}
