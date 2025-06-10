package DigitalWalltSystem;

public abstract class PaymentMethod {
    protected Account account1;
    protected Account account2;
    protected double amount;

    public PaymentMethod(Account account1, Account account2, double amount){
        this.account1 = account1;
        this.account2 = account2;
        this.amount = amount;
    }

    public abstract void processPayment();
}
