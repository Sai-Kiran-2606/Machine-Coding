package VendingMachine;

public interface VendingStateInterface {
    void selectItem(VendingMachineState context, Slot slot);
    void insertMoney(VendingMachineState context, double amount, VendingMoneyStrategy moneyStrategy, Slot slot);
    void dispenseItem(VendingMachineState context);
}
