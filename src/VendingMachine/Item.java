package VendingMachine;

public class Item {
    private int itemId;
    private String itemName;
    private double price;
    private ItemType type;

    public Item(int itemId, String itemName, double price, ItemType type) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.type = type;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
