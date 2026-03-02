package Bai3;

import Bai3.Controllers.TransactionController;
import Bai3.Models.Account;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        TransactionController controller = new TransactionController();

        // Trường hợp 1: Thành công
        Account user1 = new Account("admin", 5000);
        controller.processTransaction(user1, 2000);

        // Trường hợp 2: Thất bại do sai User (Xác thực)
        Account user2 = new Account("guest", 1000);
        controller.processTransaction(user2, 500);

        Thread.sleep(5000);
    }
}