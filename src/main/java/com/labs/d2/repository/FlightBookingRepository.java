package com.labs.d2.repository;

import com.labs.d2.model.Customer;
import com.labs.d2.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {


}
