package com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.right;

// This class contain common code so you doesn't modify again and again.
public class AreaCalculator {
    public static void main(String[] args) {
        double circle = areaCalculator(new CircleArea(5));
        double square = areaCalculator(new SquareArea(10));
        double rect = areaCalculator(new RectangleArea(5, 10));
        System.out.println(circle + " " + square + " " + rect);
    }

    public static double areaCalculator(Shape shape) {
        return shape.area();
    }
}
