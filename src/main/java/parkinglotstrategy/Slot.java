package parkinglotstrategy;

import java.util.Objects;

public class Slot {
    private int slotNumber;
    public Vehicle vehicle;

    public Slot(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Slot slot = (Slot) that;
        Object vehicle = new Object();
        return Objects.equals(vehicle, slot.vehicle);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
