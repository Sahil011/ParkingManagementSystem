package com.sahil.parking.dto;


import com.sahil.parking.models.Operator;
import com.sahil.parking.models.ParkingSpot;
import com.sahil.parking.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTicketDto {
    private Vehicle vehicle;
    private Operator operator;
    private ParkingSpot parkingspot;


}
