package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.right;

public class LSP {
    public static void main(String[] args) {
        PayClassification payClassification = new PayClassification();
        payClassification.calculateSalary();
        payClassification.addTimeCardDetails();

        payClassification = new MonthlySalary();
        payClassification.calculateSalary();
        payClassification.addTimeCardDetails();

        payClassification = new HourlySalary();
        payClassification.calculateSalary();
        payClassification.addTimeCardDetails();

        payClassification = new CommissionSalary();
        payClassification.calculateSalary();
        payClassification.addTimeCardDetails();
    }
}
