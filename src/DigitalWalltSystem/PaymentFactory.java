package DigitalWalltSystem;

public class PaymentFactory {

    public PaymentFactory(){}

    public PaymentMethod getPaymentType(Account account1, Account account2, double amount){
        if(account1 instanceof Wallet && account2 instanceof Wallet){
            return new WalletToWallet(account1, account2, amount);
        }
        else if(account1 instanceof Wallet && account2 instanceof Bank){
            return new WalletToBank(account1, account2, amount);
        }
        else if(account1 instanceof Bank && account2 instanceof Wallet){
            return new BankToWallet(account1, account2, amount);
        }
        return null;
    }
}
