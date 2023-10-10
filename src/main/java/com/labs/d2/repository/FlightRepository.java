package com.labs.d2.repository;

import com.labs.d2.model.Customer;
import com.labs.d2.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
    Optional<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findAllByAircraftContaining(String str);
    List<Flight> findAllByFlightMileageGreaterThan(Integer flightMileage);

}
