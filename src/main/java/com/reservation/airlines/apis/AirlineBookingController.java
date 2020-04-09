package com.reservation.airlines.apis;

import com.reservation.airlines.model.Flight;
import com.reservation.airlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/airlines")
public class AirlineBookingController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/airline")
    public Flight addFlight(@RequestBody  Flight flight) {
        return flightService.addFlight(flight);
    }

    @GetMapping("/airline")
    public List<Map.Entry<Integer, Flight>> searchFlight(@RequestBody Flight flight) {
        return flightService.searchFlight(flight);
    }
}
