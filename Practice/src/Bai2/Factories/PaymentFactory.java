package Bai2.Factories;

import Bai2.Interfaces.Payment;
import Bai2.PaymentTypes.CashPayment;
import Bai2.PaymentTypes.CreditCardPayment;
import Bai2.PaymentTypes.PayPalPayment;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type == null) return null;

        return switch (type.toUpperCase()) {
            case "CREDIT" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "CASH" -> new CashPayment();
            default -> throw new IllegalArgumentException("Phương thức thanh toán không hợp lệ!");
        };
    }
}
