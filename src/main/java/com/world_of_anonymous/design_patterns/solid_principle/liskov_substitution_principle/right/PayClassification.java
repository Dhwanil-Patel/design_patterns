package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.right;

public class PayClassification {
    public float calculateSalary() {
        System.out.println("Parent class salary for monthly and hourly...!!!");
        return 0.0f;
    }
    public void addTimeCardDetails() {
        System.out.println("Parent Time card for hourly and monthly salary.");
    }
}
