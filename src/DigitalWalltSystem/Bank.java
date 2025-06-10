package DigitalWalltSystem;

public class Bank extends Account{
    private String accountNumber;
    private String IFSCCode;

    public Bank(int id, User user, double balance, String accountNumber, String IFSCCode){
        super(id, user, balance);
        this.accountNumber = accountNumber;
        this.IFSCCode = IFSCCode;
    }

    @Override
    public boolean credit(double amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean debit(double amount) {
        if(balance - amount < 0) {
            System.out.println("Insufficient balance " + balance);
            return false;
        }

        balance -= amount;
        return true;
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
}
