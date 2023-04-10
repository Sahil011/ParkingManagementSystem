package com.sahil.parking.repositories;

import com.sahil.parking.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private int ticket_id =0;

    private Map<Integer, Ticket> ticketMap = new HashMap<>();
    public Ticket save(Ticket ticket){
        ticket.setId(ticket_id++);
        ticketMap.put(ticket_id, ticket);
        return ticket;
    }

    public Ticket getTicket(Integer ticketId){
        return ticketMap.get(ticketId);
    }
}
