package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private List<VehicleType> supportedVehicle;
    private SlotStatus status;
    private String spotName;
    private Vehicle parkedVehicle;

}
