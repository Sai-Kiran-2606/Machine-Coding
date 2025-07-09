package VendingMachine;

import java.util.logging.Logger;

public class ItemSelectedState implements VendingStateInterface {
    private static final Logger log = Logger.getLogger(ItemSelectedState.class.getName());

    @Override
    public void selectItem(VendingMachineState context, Slot slot) {
        log.info("Item already selected " + context.getCurrentItem());
    }

    @Override
    public void insertMoney(VendingMachineState context, double amount, VendingMoneyStrategy moneyStrategy, Slot slot) {
        log.info("Amount inserted for the item " + context.getCurrentItem()+" is "+amount);
        if("Cash".equalsIgnoreCase(moneyStrategy.getPaymentType())){
            log.info("Using Cash payment strategy.");
            moneyStrategy.payMoney(amount, slot.getItem().getPrice());
        } else if("Card".equalsIgnoreCase(moneyStrategy.getPaymentType())) {
            log.info("Using Card payment strategy.");
            moneyStrategy.payMoney(amount, slot.getItem().getPrice());
        } else {
            log.warning("Unknown payment strategy.");
        }
        context.setInsertAmount(amount);
        context.setState(new DispenseState());
    }

    @Override
    public void dispenseItem(VendingMachineState context) {
        log.info("Insert money before dispensing.");
    }
}
