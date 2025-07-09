package VendingMachine;

public class Slot {
    private int slotNo;
    private Item item;
    private int quantity;
    private int maxCapacity;

    public Slot(int slotNo, Item item, int quantity, int maxCapacity) {
        this.slotNo = slotNo;
        this.item = item;
        this.quantity = quantity;
        this.maxCapacity = maxCapacity;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
