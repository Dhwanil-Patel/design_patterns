package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.right;

public class CreditCardPayment implements IOnlinePayment {
    @Override
    public void savePaymentDetails() {
        System.out.println("Save payment details to the database for online procurement...!!!");
    }

    @Override
    public void saveCardDetails() {
        System.out.println("Save credit card detail to database for online procurement...!!!");
    }
}