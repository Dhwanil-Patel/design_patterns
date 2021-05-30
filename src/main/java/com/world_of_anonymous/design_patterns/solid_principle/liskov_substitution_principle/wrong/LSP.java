package com.world_of_anonymous.design_patterns.solid_principle.liskov_substitution_principle.wrong;

public class LSP {
    public static void main(String[] args) {
        ITimeCard iTimeCard = new MonthlySalary();
        iTimeCard.calculateSalary();
        iTimeCard.addTimeCardDetails();

        iTimeCard = new HourlySalary();
        iTimeCard.calculateSalary();
        iTimeCard.addTimeCardDetails();

        IPayClassification iPayClassification = new CommissionSalary();
        iPayClassification.calculateSalary();
    }
}
