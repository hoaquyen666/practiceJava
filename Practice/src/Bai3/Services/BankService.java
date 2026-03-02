package Bai3.Services;

import Bai3.Models.Account;
import java.util.concurrent.CompletableFuture;

public class BankService {

    public CompletableFuture<Boolean> authenticate(String user) {
        return CompletableFuture.supplyAsync(() -> {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            if ("admin".equals(user)) {
                System.out.println("[1] Xác thực thành công: " + user);
                return true;
            }
            throw new RuntimeException("Xác thực thất bại: Sai tên đăng nhập.");
        });
    }

    public CompletableFuture<Double> checkBalance(Account account, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            if (account.getBalance() >= amount) {
                System.out.println("[2] Số dư khả dụng.");
                return account.getBalance();
            }
            throw new RuntimeException("Giao dịch bị hủy: Số dư không đủ.");
        });
    }

    public CompletableFuture<String> transferMoney(double amount) {
        return CompletableFuture.supplyAsync(() -> {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            return "Thành công: Đã chuyển " + amount + " VNĐ.";
        });
    }
}