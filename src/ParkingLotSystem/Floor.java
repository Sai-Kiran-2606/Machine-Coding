package ParkingLotSystem;

import java.util.List;
import java.util.Optional;

public class Floor {
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public Floor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = spots;
    }

    public synchronized Optional<ParkingSpot> getAvailableSpot(Vehicle vehicle){
        return parkingSpots.stream()
                .filter(spot -> spot.isAvailable() && spot.getVehicleType() == vehicle.getType())
                .findFirst();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getSpots() {
        return parkingSpots;
    }
}
