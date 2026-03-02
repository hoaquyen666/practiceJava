package Bai2;

import Bai2.Controllers.PaymentController;
import Bai2.Utils.CheckInput;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckInput checkInput = new CheckInput();
        PaymentController controller = new PaymentController();

        controller.process(scanner, checkInput);
    }
}
