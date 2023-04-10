package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel{

    private List<Floor> floor;
    private List<EntryGate> entryGates;
    private List<Gate> exitGate;
    private String address;
    private String name;


}
