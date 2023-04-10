package com.sahil.parking.strategy.spotassignment;

import com.sahil.parking.models.*;

public class RandonSpotAssignmentStrategy implements SpotAssignmentStrategy{


    @Override
    public ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle) {
        for(Floor floor : parkingLot.getFloor()){
            for(ParkingSpot parkingSpot: floor.getParkingSpot()){
                if (SlotStatus.AVAILABLE.equals(parkingSpot.getStatus()) && parkingSpot.getSupportedVehicle().contains(vehicle.getType())){
                    parkingSpot.setStatus(SlotStatus.LOOKED);
                    parkingSpot.setParkedVehicle(vehicle);
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
