package com.sahil.parking.repositories;

import com.sahil.parking.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Integer parkingLotNumber=0;
    private Map<Integer, ParkingLot> parkingLots = new HashMap<Integer, ParkingLot>();

    public ParkingLot addParkingLot(ParkingLot parkingLot){
        parkingLot.setId(parkingLotNumber++);
        parkingLots.put(parkingLotNumber, parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLot(Integer parkingLotId){
        return parkingLots.get(parkingLotId);
    }

    public ParkingLot updateParkingLot(ParkingLot parkingLot){
        parkingLots.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }


}
