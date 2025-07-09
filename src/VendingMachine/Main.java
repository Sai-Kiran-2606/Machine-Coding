package VendingMachine;

import java.util.Map;

public class Main {
    public  static void main(String[] args){
        Item diaryMilk = new Item(1, "Diary Milk", 5, ItemType.Chocolate);
        Item bisleri = new Item(2, "Bisleri", 20, ItemType.Water);
        Item britania = new Item(3, "Britania", 10, ItemType.Cake);
        Item doritos = new Item(4, "Doritos", 10, ItemType.Chips);
        Item coke = new Item(5, "Coke", 15, ItemType.Drinks);

        Slot slot1 = new Slot(1, coke, 5, 10);
        Slot slot2 = new Slot(2, doritos, 8, 10);
        Slot slot3 = new Slot(3, britania, 3, 10);
        Slot slot4 = new Slot(4, bisleri, 1, 10);
        Slot slot5 = new Slot(5, diaryMilk, 10, 10);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSlot(slot1.getSlotNo(), slot1);
        vendingMachine.addSlot(slot2.getSlotNo(), slot2);
        vendingMachine.addSlot(slot3.getSlotNo(), slot3);
        vendingMachine.addSlot(slot4.getSlotNo(), slot4);
        vendingMachine.addSlot(slot5.getSlotNo(), slot5);

        Map<Integer, Slot> slots = vendingMachine.getSlots();

        VendingMachineState vendingMachineState = new VendingMachineState();
        vendingMachineState.selectItemMethod(slots.get(1));
        vendingMachineState.insertCoinMethod(20, slots.get(1), new CashStrategy());
        vendingMachineState.dispenseItemMethod();
    }
}
