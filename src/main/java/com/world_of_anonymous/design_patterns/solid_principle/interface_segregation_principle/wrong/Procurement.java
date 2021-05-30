package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.wrong;

public class Procurement {
    private IPayment _paymentHandler;

    public Procurement(IPayment _paymentHandler) {
        this._paymentHandler = _paymentHandler;
    }

    public void calculatePayment() {
        this._paymentHandler.savePaymentDetails();
        this._paymentHandler.saveCardDetails();
    }
}
