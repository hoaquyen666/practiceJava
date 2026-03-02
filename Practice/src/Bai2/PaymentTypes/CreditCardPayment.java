package Bai2.PaymentTypes;

import Bai2.Interfaces.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard processing: " + amount);
    }
}
