package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
public class Invoice {
    private Ticket ticket;
    private int amount;//asum apsolute fig
    private List<Payment> payment;
    private Date exitTime;
    private Gate exitGate;
    private Operator operator;
    private PaymentStatus paymentStatus;



}
