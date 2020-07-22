package parkinglotstrategy;

import com.parking.parkinglot.ParkingLot;
import com.parkinglot.exception.ParkingLotException;

public class AssignLot {
    ParkingStrategy strategy = new ParkingStrategy();

    public ParkingLot getLot(DriverType driverType) throws ParkingLotException {
        if (driverType.equals(DriverType.HANDICAP))
            return strategy.getLotForHandicapDriver();
        return strategy.getLotForNormalDriver();
    }
}