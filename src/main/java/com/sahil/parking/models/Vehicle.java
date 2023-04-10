package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle  extends  BaseModel{
    private String vehicleNumber;
    private VehicleType type;

}
