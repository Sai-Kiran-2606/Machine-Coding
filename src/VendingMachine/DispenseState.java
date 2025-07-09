package VendingMachine;

import java.util.logging.Logger;

public class DispenseState implements VendingStateInterface {
    private static final Logger log = Logger.getLogger(IdleState.class.getName());

    @Override
    public void selectItem(VendingMachineState context, Slot slot) {
        log.info("Cannot change item after dispensing");
    }

    @Override
    public void insertMoney(VendingMachineState context, double amount, VendingMoneyStrategy moneyStrategy, Slot slot) {
        log.info("Money already inserted");
    }

    @Override
    public void dispenseItem(VendingMachineState context) {
        log.info("Dispensing item " + context.getCurrentItem());
    }
}
