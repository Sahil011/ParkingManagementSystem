package com.sahil.parking.dto;

import com.sahil.parking.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenrateTicketResponse {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }
}
