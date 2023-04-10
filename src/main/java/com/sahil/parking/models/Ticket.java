package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends  BaseModel{

    private Date entryTime;
    private Vehicle vehicle;
    private Operator operator;
    private ParkingSpot parkingspot;
    private EntryGate entryGate;


}
