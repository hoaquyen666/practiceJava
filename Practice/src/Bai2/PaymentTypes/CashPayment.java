package Bai2.PaymentTypes;

import Bai2.Interfaces.Payment;

public class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("CashPayment processing: " + amount);
    }
}
