package com.reservation.airlines.model;

import lombok.Data;

@Data
public class Flight {

    private int flightId;
    private int flightNbr;
    private String  airline;
    private String origin;
    private String destination;
    private String startDate;
    private String returnDate;
    private Double fare;
}
