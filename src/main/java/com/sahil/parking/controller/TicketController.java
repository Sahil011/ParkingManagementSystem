package com.sahil.parking.controller;

import com.sahil.parking.dto.CreateTicketDto;
import com.sahil.parking.dto.GenrateTicketResponse;
import com.sahil.parking.models.Ticket;
import com.sahil.parking.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }


    public GenrateTicketResponse createTicket(CreateTicketDto ticketDto){
        Ticket ticket = ticketService.createTicket(ticketDto.getVehicle(), ticketDto.getOperator(), ticketDto.getParkingspot());
        GenrateTicketResponse ticketResponse = new GenrateTicketResponse();
        ticketResponse.setTicket(ticket);
        return ticketResponse;
    }

}
