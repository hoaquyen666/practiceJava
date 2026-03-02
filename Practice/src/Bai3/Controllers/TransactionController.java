package Bai3.Controllers;

import Bai3.Models.Account;
import Bai3.Services.BankService;

public class TransactionController {
    private BankService bankService = new BankService();

    public void processTransaction(Account account, double amount) {
        bankService.authenticate(account.getUsername())
                .thenCompose(authOk -> bankService.checkBalance(account, amount))
                .thenCompose(balanceOk -> bankService.transferMoney(amount))
                .thenAccept(result -> System.out.println("KẾT QUẢ: " + result))
                .exceptionally(ex -> {
                    System.err.println("LỖI HỆ THỐNG: " + ex.getMessage());
                    return null;
                });
    }
}