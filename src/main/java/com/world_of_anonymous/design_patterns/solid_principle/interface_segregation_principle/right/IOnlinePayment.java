package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.right;

public interface IOnlinePayment extends IPayment {
    void saveCardDetails();
}
