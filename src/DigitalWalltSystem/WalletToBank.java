package DigitalWalltSystem;

import java.time.LocalDateTime;

public class WalletToBank extends PaymentMethod{

    public WalletToBank(Account account1, Account account2, double amount){
        super(account1, account2, amount);
    }

    @Override
    public void processPayment() {
        if(account1.debit(amount)){
            account2.credit(amount);
            account1.addTransaction(new Transaction(account1, account2, amount, LocalDateTime.now()));
            account2.addTransaction(new Transaction(account1, account2, amount, LocalDateTime.now()));
            System.out.println("Amount of rupees " + amount + " has been transferred from Wallet of " +
                    account1.user.getName() + " to Bank of " + account2.user.getName());
        }
        else {
            System.out.println("Transaction aborted due to insufficient funds at user " + account1.user.getName());
        }
    }
}
