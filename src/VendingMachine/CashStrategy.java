package VendingMachine;

import java.util.logging.Logger;

public class CashStrategy implements VendingMoneyStrategy{
    private static final Logger logger = Logger.getLogger(CashStrategy.class.getName());

    private double returnAmount;

    public CashStrategy() {
        this.returnAmount = 0.0;
    }

    @Override
    public void payMoney(double amountGiven, double itemPrice) {
        if(amountGiven < itemPrice){
            logger.info("Insufficient amount given. Please insert more money.");
        }
        else{
            returnAmount = amountGiven - itemPrice;
            if(returnAmount > 0) {
                logger.info("Transaction successful. Please collect your change of: " + returnAmount);
            } else {
                logger.info("Transaction successful. No change to return.");
            }
        }
    }

    public String getPaymentType() {
        return "Cash";
    }
}
