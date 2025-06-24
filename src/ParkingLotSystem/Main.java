package ParkingLotSystem;

import java.util.List;

public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot = ParkingLot.getInstance();

        List<ParkingSpot> parkingSpotsFloor1 = List.of(
                new ParkingSpot(101, VehicleType.Bike),
                new ParkingSpot(102, VehicleType.Car),
                new ParkingSpot(103, VehicleType.Truck)
        );

        List<ParkingSpot> parkingSpotsFloor2 = List.of(
                new ParkingSpot(201, VehicleType.Truck),
                new ParkingSpot(202, VehicleType.Car)
        );

        Floor floor1 = new Floor(1, parkingSpotsFloor1);
        Floor floor2 = new Floor(2, parkingSpotsFloor2);

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("XYZ789");
        Vehicle bike1 = new Bike("M1234");
        Vehicle truck1 = new Truck("T234978");

        try{
            Ticket ticket1 = parkingLot.parkVehicle(car1);
            System.out.println("Car 1 parked: " + ticket1.getTicketId());
//            parkingTickets.add(ticket1.getTicketId());

            Ticket ticket2 = parkingLot.parkVehicle(car2);
            System.out.println("Car 2 parked: " + ticket2.getTicketId());
//            parkingTickets.add(ticket2.getTicketId());

            Ticket ticket3 = parkingLot.parkVehicle(bike1);
            System.out.println("Bike 1 parked: " + ticket3.getTicketId());
//            parkingTickets.add(ticket3.getTicketId());

            Ticket ticket4 = parkingLot.parkVehicle(truck1);
            System.out.println("Truck 1 parked: " + ticket4.getTicketId());

            //try parking bike 2
            Vehicle bike2 = new Bike("S2224");
            Ticket ticket5 = parkingLot.parkVehicle(bike2);
            System.out.println("Bike 2 parked: " + ticket5.getTicketId());
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
