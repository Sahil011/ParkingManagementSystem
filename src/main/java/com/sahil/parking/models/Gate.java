package com.sahil.parking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private String name;
    private GateType gateType;
    private GateStatus status;
    private Operator operator;
}
