package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private int amount;//assuming all cal will be approx absolute amount.
    private PaymentMode paymentMode;
    private String gateway;
    private PaymentStatus paymentStatus;
    private String refid;

}
