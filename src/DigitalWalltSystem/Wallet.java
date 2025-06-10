package DigitalWalltSystem;

public class Wallet extends Account {
    private String upiId;

    public Wallet(int id, User user, double balance, String upiId){
        super(id, user, balance);
        this.upiId = upiId;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void processTransactions() {
        for(Transaction transaction: transactions){
            System.out.println("Transaction " + transaction.getId() + " done from " + transaction.getFirstAccount().user.getName() + " to " +
                    transaction.getSecondAccount().user.getName() + " for amount " + transaction.getAmount() + " at " + transaction.getTimeStamp());
        }
    }

    @Override
    public boolean credit(double amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean debit(double amount) {
        double commissionAmount = amount*0.05;

        if((balance - (amount + commissionAmount)) < 0){
            System.out.println("Insufficient balance " + commissionAmount);
            return false;
        }

        balance -= (amount + commissionAmount);

        return true;
    }
}
