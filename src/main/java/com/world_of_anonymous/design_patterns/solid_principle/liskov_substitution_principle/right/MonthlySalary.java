package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.right;

public class MonthlySalary extends PayClassification {

    @Override
    public float calculateSalary() {
        System.out.println("Child class for monthly salary...!!!");
        return 0.0f;
    }

    @Override
    public void addTimeCardDetails() {
        System.out.println("Monthly : Child Time card for monthly salary.");
    }
}
