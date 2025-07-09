package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private final Map<Integer, Slot> slots = new HashMap<>();

    public VendingMachine() {
    }

    public void addSlot(Integer slotNo, Slot slot){
        slots.put(slotNo, slot);
    }

    public Map<Integer, Slot> getSlots() {
        return slots;
    }
}
