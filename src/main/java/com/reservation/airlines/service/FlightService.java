package com.reservation.airlines.service;

import com.reservation.airlines.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface FlightService {
    public Flight addFlight(Flight flight);
    public List<Map.Entry<Integer, Flight>> searchFlight(Flight flight);
}
