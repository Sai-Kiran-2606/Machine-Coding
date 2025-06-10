package DigitalWalltSystem;

import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;
    private int id;
    private Account firstAccount;
    private Account secondAccount;
    private double amount;
    private LocalDateTime timeStamp;

    public Transaction(Account firstAccount, Account secondAccount, double amount, LocalDateTime time) {
        this.id = counter++;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.amount = amount;
        this.timeStamp = time;
    }

    public int getId() {
        return id;
    }

    public Account getFirstAccount(){
        return firstAccount;
    }

    public Account getSecondAccount(){
        return secondAccount;
    }

    public double getAmount(){
        return amount;
    }

    public LocalDateTime getTimeStamp(){
        return timeStamp;
    }
}
