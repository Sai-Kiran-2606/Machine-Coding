package ParkingLotSystem;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Floor> floors = new ArrayList<>();
    private final Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();


    public static ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }

        return instance;
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) throws Exception{
        for(Floor floor : floors){
            Optional<ParkingSpot> spotOptional = floor.getAvailableSpot(vehicle);

            if(spotOptional.isPresent()){
                ParkingSpot spot = spotOptional.get();
                if(spot.park(vehicle)){
                    String ticketId = UUID.randomUUID().toString();
                    Ticket ticket = new Ticket(ticketId, vehicle, spot);
                    activeTickets.put(ticketId, ticket);
                    return ticket;
                }
            }
        }
        throw new Exception("No available spot for " + vehicle.getLicensePlate());
    }

    public synchronized void unParkVehicle(String ticketId) throws Exception{
        Ticket ticket = activeTickets.get(ticketId);
        activeTickets.remove(ticketId);

        if(ticket == null) throw new Exception("Invalid ticket");

        ParkingSpot spot = ticket.getParkingSpot();
        spot.unPark();

        ticket.setExitTime();

        System.out.println("Pay the fee of 10$");
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
