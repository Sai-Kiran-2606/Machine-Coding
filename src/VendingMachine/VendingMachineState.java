package VendingMachine;

public class VendingMachineState {
    private VendingStateInterface currentState;
    private String selectedItem;
    private double insertAmount;

    public VendingMachineState(){
        this.currentState = new IdleState();
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public void setInsertAmount(double insertAmount) {
        this.insertAmount = insertAmount;
    }

    public void setState(VendingStateInterface state){
        this.currentState = state;
    }

    public String getCurrentItem(){
        return selectedItem;
    }

    public double getInsertAmount(){
        return insertAmount;
    }

    public void selectItemMethod(Slot slot){
        currentState.selectItem(this, slot);
    }

    public void insertCoinMethod(double amount, Slot slot, VendingMoneyStrategy moneyStrategy){
        currentState.insertMoney(this, amount, moneyStrategy, slot);
    }

    public void dispenseItemMethod(){
        currentState.dispenseItem(this);
    }
}
