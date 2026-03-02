package Bai1.Controllers;

import Bai1.Models.Student;
import Bai1.Utils.CheckInput;
import java.util.List;
import java.util.Scanner;

public class DelStudent {
    public void del(List<Student> studentList, Scanner scanner, CheckInput checkInput) {
        System.out.println("\n--- XÓA SINH VIÊN ---");
        System.out.print("Nhập MSSV cần xóa: ");
        int mssv = checkInput.checkInt(scanner);

        boolean removed = studentList.removeIf(s -> s.getMSSV() == mssv);

        if (removed) {
            System.out.println("Xóa thành công sinh viên có MSSV: " + mssv);
        } else {
            System.out.println("Không tìm thấy sinh viên với MSSV này");
        }
    }
}