package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.wrong;

public class Payment implements IPayment {
    @Override
    public void savePaymentDetails() {
        System.out.println("Save payment details to the database for offline procurement...!!!");
    }

    @Override
    public void saveCardDetails() {
        System.out.println("No action for this functionality needed for offline payment...!!!");
    }
}
