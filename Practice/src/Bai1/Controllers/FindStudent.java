package Bai1.Controllers;

import Bai1.Models.Student;
import java.util.List;
import java.util.Scanner;

public class FindStudent {
    public void find(List<Student> studentList, Scanner scanner) {
        System.out.println("\n--- TÌM KIẾM SINH VIÊN ---");
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String keyName = scanner.next();
        boolean found = false;

        for (Student std : studentList) {
            if (std.getName().toLowerCase().contains(keyName.toLowerCase())) {
                System.out.println(std);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có tên: " + keyName);
        }
    }
}