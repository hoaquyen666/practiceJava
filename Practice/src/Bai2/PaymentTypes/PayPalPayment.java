package Bai2.PaymentTypes;

import Bai2.Interfaces.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal processing: " + amount);
    }
}
