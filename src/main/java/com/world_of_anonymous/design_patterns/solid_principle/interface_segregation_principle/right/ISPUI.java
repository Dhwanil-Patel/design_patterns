package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.right;

public class ISPUI {
    public static void main(String[] args) {
        IPayment payment = new Payment();
        Procurement offlineProcurement = new Procurement();
        offlineProcurement.savePayment(payment);

        System.out.println("<<<<<<<<<<>>>>>>>>>>");

        IOnlinePayment onlinePayment = new CreditCardPayment();
        Procurement onlineProcurement = new Procurement();
        onlineProcurement.savePayment(onlinePayment);
        onlineProcurement.saveCardDetails(onlinePayment);
    }
}
