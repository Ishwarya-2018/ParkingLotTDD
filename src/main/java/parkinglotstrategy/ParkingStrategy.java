package parkinglotstrategy;

import com.parking.parkinglot.ParkingLot;
import com.parking.parkinglot.ParkingLotSystem;
import com.parkinglot.exception.ParkingLotException;

import java.util.ArrayList;
import java.util.List;

public class ParkingStrategy {
    public ParkingLot getLotForHandicapDriver() throws ParkingLotException {
        return ParkingLotSystem.parkingLotsList.stream().filter(parkingLot -> parkingLot.getEmptySlots().size() > 0)
                .findFirst().orElseThrow(() -> new ParkingLotException(ParkingLotException.ExceptionType.PARKING_LOT_CAPACITY_FULL, ""));
    }

    public ParkingLot getLotForNormalDriver() {
        List<ParkingLot> tempLots = new ArrayList<>(ParkingLotSystem.parkingLotsList);
        return tempLots.get(0);
    }

}
