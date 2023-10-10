package com.labs.d2.repository;

import com.labs.d2.model.Flight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    FlightRepository flightRepository;

    @Test
    public void createNewFlight_correctCase() {
        Flight f1 = new Flight("DL24","Airbus A400",200,2000);
        flightRepository.save(f1);
        List<Flight> flightList = flightRepository.findAll();
        System.out.println(flightList);
        assertEquals(6, flightList.size());
        System.out.println(flightList);
        flightRepository.deleteById(f1.getFlightId());
    }

    @Test
    public void findByFlightNumber_validNumber_correctFlightNumber() {
        Optional<Flight> flightOptional = flightRepository.findByFlightNumber("DL143");
        assertTrue(flightOptional.isPresent());
        System.out.println(flightOptional.get());
        assertEquals("Boeing 747", flightOptional.get().getAircraft());
    }

    @Test
    public void findAllByAircraftContaining_str_flightList() {
        List<Flight> flightList = flightRepository.findAllByAircraftContaining("Boeing");
        System.out.println(flightList);
        assertEquals(4, flightList.size());
    }

    @Test
    public void findAllByFlightMileageGreaterThan_validFlightMileage_flightList() {
        List<Flight> flightList = flightRepository.findAllByFlightMileageGreaterThan(500);
        System.out.println(flightList);
        assertEquals(4, flightList.size());
    }


}