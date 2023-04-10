package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Floor {
    private String Name;
    private List<ParkingSpot> parkingSpot;
}
