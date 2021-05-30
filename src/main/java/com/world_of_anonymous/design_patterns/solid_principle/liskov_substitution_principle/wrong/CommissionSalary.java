package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.wrong;

public class CommissionSalary implements IPayClassification {
    @Override
    public float calculateSalary() {
        System.out.println("Child class for commission salary...!!!");
        return 0.0f;
    }
}
