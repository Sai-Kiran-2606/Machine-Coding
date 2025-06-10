package DigitalWalltSystem;

public class Main{
    public static void main(String[] args){
        User user1 = new User(1, "Sai", "sai@gmail.com", "123");
        User user2 = new User(2, "Vamsi", "vamsi@gmail.com", "321");

        Account saiWallet = new Wallet(1, user1, 1500.00, "sai@okhdfc.com");
        Account vamsiWallet = new Wallet(2, user2, 10000.00, "vamsi@okaxis.com");

        Account saiBank = new Bank(1, user1, 2540.00, "123456", "HYDERABAD");
        Account vamsiBank = new Bank(2, user2, 1313.00, "9780463", "BANGLORE");

        user1.addAccount(saiWallet);
        user1.addAccount(saiBank);
        user2.addAccount(vamsiWallet);
        user2.addAccount(vamsiBank);

        PaymentFactory paymentFactory = new PaymentFactory();

        PaymentMethod walletToWalletPayment = paymentFactory.getPaymentType(saiWallet, vamsiWallet, 1000);
        walletToWalletPayment.processPayment();

        System.out.println(vamsiWallet.getBalance());

        PaymentMethod walletToBankPayment = paymentFactory.getPaymentType(vamsiWallet, saiBank, 5000);
        walletToBankPayment.processPayment();

        System.out.println(saiBank.getBalance());

        PaymentMethod bankToWalletPayment = paymentFactory.getPaymentType(vamsiBank, saiWallet, 1200.574);
        bankToWalletPayment.processPayment();

        System.out.println(saiWallet.getBalance());

        saiWallet.processTransactions();
    }
}