package Bai1.Controllers;

import Bai1.Models.Student;
import java.util.List;

public class DisplayStudent {
    public void display(List<Student> studentList) {
        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        if (studentList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Student std : studentList) {
                System.out.println(std);
            }
        }
    }
}