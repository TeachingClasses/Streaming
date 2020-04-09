package com.reservation.airlines.repository;

import com.reservation.airlines.model.Flight;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
@Repository
public class FlightRepositoryImpl implements FlightRepository {

    private static Map<Integer, Flight> flightMap = new HashMap<Integer, Flight>();
    private static Integer flightNbr = 1001;

    @Override
    public Flight addFlight(Flight flight) {
        //Set random number for flight id, this id is for the UI purpose only
        flight.setFlightId(new Random().nextInt());
        flight.setFlightNbr(flightNbr);
        //Increment the flightNbr for nex flight to add
        flightNbr = flightNbr + 1;
        flightMap.put(flight.getFlightNbr(), flight);
        return flight;
    }

    @Override
    public List<Map.Entry<Integer, Flight>> searchFlight(Flight flight) {

        List<Map.Entry<Integer, Flight>> list = flightMap.entrySet().stream()
                .filter(x -> flight.getOrigin().equals(x.getValue().getOrigin()))
                .filter(x -> flight.getDestination().equals(x.getValue().getDestination()))
                .filter(x -> flight.getStartDate().equals(x.getValue().getStartDate()))
                .collect(Collectors.toList());

        /*flight.setFlightNbr(345);
        Double fare = new Double(100.00);
        flight.setFare(fare);
        if (new Date(flight.getStartDate()).getMonth() > 10) {
            fare = fare + (fare * 20 / 100);
            flight.setFare(fare);
        }*/
        return list;
    }
}
