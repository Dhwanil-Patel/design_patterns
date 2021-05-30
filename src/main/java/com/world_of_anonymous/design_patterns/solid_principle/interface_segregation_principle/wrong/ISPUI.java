package com.world_of_anonymous.design_patterns.solid_principle.interface_segregation_principle.wrong;


public class ISPUI {
    public static void main(String[] args) {
        IPayment payment = new Payment();
        Procurement procurement = new Procurement(payment);
        procurement.calculatePayment();

        System.out.println("<<<<<<<<<<>>>>>>>>>>");

        IPayment onlinePayment = new CreditCardPayment();
        Procurement onlineProcurement = new Procurement(payment);
        onlineProcurement.calculatePayment();
    }
}
