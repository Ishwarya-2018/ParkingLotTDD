package com.parking.parkinglot;

public class ParkingLotOwner implements ParkingLotObserver {
    private boolean isFullCapacity;

    @Override
    public void capacityIsFull() {
        isFullCapacity = true;
    }

    public boolean isCapacityFull() {
        return this.isFullCapacity;
    }

    @Override
    public void capacityIsAvailable() {
        isFullCapacity = false;
    }
}