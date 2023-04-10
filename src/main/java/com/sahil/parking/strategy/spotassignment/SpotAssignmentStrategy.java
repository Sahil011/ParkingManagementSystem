package com.sahil.parking.strategy.spotassignment;

import com.sahil.parking.models.ParkingLot;
import com.sahil.parking.models.ParkingSpot;
import com.sahil.parking.models.Vehicle;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignParkingSpot(ParkingLot parkingLot, Vehicle vehicle);
}
