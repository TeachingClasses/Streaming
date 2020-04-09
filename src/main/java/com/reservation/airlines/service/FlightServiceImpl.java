package com.reservation.airlines.service;

import com.reservation.airlines.model.Flight;
import com.reservation.airlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.addFlight(flight);
    }

    @Override
    public List<Map.Entry<Integer, Flight>> searchFlight(Flight flight) {
        return flightRepository.searchFlight(flight);
    }
}
