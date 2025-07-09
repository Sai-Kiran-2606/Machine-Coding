package VendingMachine;

public interface VendingMoneyStrategy {
    void payMoney(double amountGiven, double itemPrice);

    String getPaymentType();
}
