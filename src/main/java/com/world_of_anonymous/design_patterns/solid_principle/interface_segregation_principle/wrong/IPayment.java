package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.wrong;

public interface IPayment {
    void savePaymentDetails();
    void saveCardDetails();
}
