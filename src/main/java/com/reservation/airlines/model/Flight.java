package com.reservation.airlines.model;

import lombok.Data;

import java.util.Date;

@Data
public class Flight {

    private int flightId;
    private int flightNbr;
    private String  airline;
    private String origin;
    private String destination;
    private Date startDate;
    private Date returnDate;
    private Double fare;
}
