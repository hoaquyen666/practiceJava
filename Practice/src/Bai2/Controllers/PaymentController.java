package Bai2.Controllers;

import Bai2.Factories.PaymentFactory;
import Bai2.Interfaces.Payment;
import Bai2.Utils.CheckInput;

import java.util.Scanner;

public class PaymentController {
    public void process(Scanner scanner, CheckInput checkInput) {
        System.out.println("\n--- HỆ THỐNG THANH TOÁN ---");
        System.out.print("Nhập số tiền cần thanh toán: ");
        double amount = checkInput.checkDouble(scanner);

        System.out.println("Chọn phương thức (CREDIT, PAYPAL, CASH): ");
        String type = scanner.next();

        try {
            Payment method = PaymentFactory.getPaymentMethod(type);
            method.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
