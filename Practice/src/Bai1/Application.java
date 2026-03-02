package Bai1;

import Bai1.Controllers.AddStudent;
import Bai1.Controllers.DelStudent;
import Bai1.Controllers.DisplayStudent;
import Bai1.Controllers.FindStudent;
import Bai1.Models.Student;
import Bai1.Utils.CheckInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CheckInput checkInput = new CheckInput();
        List<Student> studentList = new ArrayList<>();

        AddStudent addController = new AddStudent();
        DelStudent delController = new DelStudent();
        DisplayStudent displayController = new DisplayStudent();
        FindStudent findController = new FindStudent();

        while (true) {
            System.out.println("\nChọn chức năng (1-4):");
            System.out.println("1. Thêm | 2. Xóa | 3. Hiển thị | 4. Tìm kiếm | 0. Thoát");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        addController.add(studentList, scanner, checkInput);
                        break;
                    }
                    case 2: {
                        delController.del(studentList, scanner, checkInput);
                        break;
                    }
                    case 3: {
                        displayController.display(studentList);
                        break;
                    }
                    case 4: {
                        findController.find(studentList, scanner);
                        break;
                    }
                    case 0:
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
    }
}
