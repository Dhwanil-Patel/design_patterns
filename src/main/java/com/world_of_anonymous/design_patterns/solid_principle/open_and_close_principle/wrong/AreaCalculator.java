package com.world_of_anonymous.design_patterns.solid_principle.open_and_close_principle.wrong;

public class AreaCalculator {
    private int redius = 5;
    int height = 10;
    int width = 15;

    // Phase : 1 Client call for circle area calculation
    public double areaOfCircle(int redius) {
        return (2 * 3.14) * redius * redius;
    }

    // Phase : 2 Client call for Square area calculation
    public double areaOfSquare(int line) {
        return line * line;
    }

    // Phase : 3 Client call for Rectangle area calculation
    public double areaOfRectangle(int height, int width) {
        return height * width;
    }

    // Each phase you have to modify your actual class, all calculate same area.
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        String areaType = "rect";
        Double result = 0.0d;
        switch (areaType) {
            case "circle":
                result = areaCalculator.areaOfCircle(5);
                break;

            case "squre":
                result = areaCalculator.areaOfSquare(5);
                break;

            case "rect":
                result = areaCalculator.areaOfRectangle(5, 10);
                break;
        }
        System.out.println(result);
    }
}
