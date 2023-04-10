package com.sahil.parking.service;

import com.sahil.parking.dto.GenrateTicketResponse;
import com.sahil.parking.models.*;
import com.sahil.parking.repositories.TicketRepository;

public class TicketService {
    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Vehicle vechile, Operator operator,ParkingSpot parkingSpot){
        parkingSpot.setStatus(SlotStatus.NOT_AVAILABLE);
        Ticket ticket = new Ticket();
        ticket.setVehicle(vechile);
        ticket.setOperator(operator);
        ticket.setParkingspot(parkingSpot);
        return ticketRepository.save(ticket);
    }
    public Ticket getTicket(Integer ticketId){
        return ticketRepository.getTicket(ticketId);
    }
}

