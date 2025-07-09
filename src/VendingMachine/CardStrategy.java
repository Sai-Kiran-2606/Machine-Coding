package VendingMachine;

import java.util.logging.Logger;

public class CardStrategy implements VendingMoneyStrategy {

    private static final Logger logger = Logger.getLogger(CardStrategy.class.getName());

    @Override
    public void payMoney(double amountGiven, double itemPrice) {
        if (amountGiven < itemPrice) {
            logger.info("Insufficient card balance. Please insert another card.");
        } else {
            logger.info("Transaction successful. Please remove your card.");
        }
    }

    public String getPaymentType() {
        return "Card";
    }
}
