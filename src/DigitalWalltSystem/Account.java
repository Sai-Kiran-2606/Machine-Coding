package DigitalWalltSystem;

import java.util.ArrayList;
import java.util.List;

abstract public class Account {
    protected int id;
    protected User user;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(int id, User user, double balance){
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public abstract boolean credit(double amount);
    public abstract boolean debit(double amount);
    public abstract void addTransaction(Transaction transaction);
    public abstract void processTransactions();

    public double getBalance(){
        return balance;
    }
}
