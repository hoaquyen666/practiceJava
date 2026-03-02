package Bai1.Utils;

import java.util.Scanner;

public class CheckInput {

    public int checkInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Xin hãy nhập số nguyên: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double checkDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Xin hãy nhập số thập phân: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}