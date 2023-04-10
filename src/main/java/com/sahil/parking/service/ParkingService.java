package com.sahil.parking.service;

import com.sahil.parking.models.EntryGate;
import com.sahil.parking.models.Floor;
import com.sahil.parking.models.Gate;
import com.sahil.parking.models.ParkingLot;
import com.sahil.parking.repositories.ParkingLotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private ParkingLotRepository parkingLotRepository;
    public ParkingService(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot addParkingLot(List<Floor> floors, List<EntryGate> entryGates, List<Gate> exitGates, String address, String name){
        ParkingLot parkingLot =  new ParkingLot();
        parkingLot.setFloor(floors);
        parkingLot.setEntryGates(entryGates);
        parkingLot.setExitGate(exitGates);
        parkingLot.setName(name);
        parkingLot.setAddress(address);
        return parkingLotRepository.addParkingLot(parkingLot);
    }
    public ParkingLot addParkingFloor(List<Floor> floor, Integer parkingLotId){
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);
        List<Floor> parkingFloors = parkingLot.getFloor();
        parkingFloors.addAll(floor);
        parkingLot.setFloor(parkingFloors);
        return parkingLot;
    }

}
