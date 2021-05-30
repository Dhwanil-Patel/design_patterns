package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.right;

public class Procurement {

    public void savePayment(IPayment payment) {
        payment.savePaymentDetails();
    }

    public void saveCardDetails(IOnlinePayment onlinePayment) {
        onlinePayment.saveCardDetails();
    }
}
