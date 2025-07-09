package VendingMachine;

import java.util.logging.Logger;

public class IdleState implements VendingStateInterface{
    private static final Logger log = Logger.getLogger(IdleState.class.getName());

    @Override
    public void selectItem(VendingMachineState context, Slot slot) {
        String itemName = slot.getItem().getItemName();
        log.info(itemName + " is been selected from the machine.");
        context.setSelectedItem(itemName);
        context.setState(new ItemSelectedState());
    }

    @Override
    public void insertMoney(VendingMachineState context, double amount, VendingMoneyStrategy moneyStrategy, Slot slot) {
        log.info("Please select an item before inserting money.");
    }

    @Override
    public void dispenseItem(VendingMachineState context) {
        log.info("No item selected. No items to dispense.");
    }
}
