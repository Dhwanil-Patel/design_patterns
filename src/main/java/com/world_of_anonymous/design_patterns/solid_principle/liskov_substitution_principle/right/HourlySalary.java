package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.right;

public class HourlySalary extends PayClassification {
    @Override
    public float calculateSalary() {
        System.out.println("Child class for hourly salary...!!!");
        return 0.0f;
    }

    @Override
    public void addTimeCardDetails() {
        System.out.println("Hourly : Child Time card for hourly salary.");
    }
}
