package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.right;

public class CommissionSalary extends PayClassification {
    @Override
    public float calculateSalary() {
        System.out.println("Child class for commission salary...!!!");
        return 0.0f;
    }

    @Override
    public void addTimeCardDetails() {
        throw new RuntimeException("There is no time configuration in commission base work.");
    }
}
