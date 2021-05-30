package com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.right;

public class SquareArea implements Shape {

    private double height;

    public SquareArea(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * height;
    }
}
