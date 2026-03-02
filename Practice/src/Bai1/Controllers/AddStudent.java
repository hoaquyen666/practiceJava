package Bai1.Controllers;

import Bai1.Models.Student;
import Bai1.Utils.CheckInput;
import java.util.List;
import java.util.Scanner;

public class AddStudent {

    public void add(List<Student> studentList, Scanner scanner, CheckInput checkInput) {
        System.out.println("\n--- THÊM SINH VIÊN ---");
        Student newStudent = new Student();

        System.out.print("Nhập MSSV: ");
        newStudent.setMSSV(checkInput.checkInt(scanner));

        System.out.print("Nhập tên sinh viên: ");
        newStudent.setName(scanner.next());

        System.out.print("Nhập GPA: ");
        newStudent.setGPA(checkInput.checkDouble(scanner));

        studentList.add(newStudent);
        System.out.println("Đã thêm thành công\n");
    }
}