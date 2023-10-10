package com.labs.d2.repository;

import com.labs.d2.model.Customer;
import com.labs.d2.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByCustomerName(String customerName);
    List<Customer> findAllByCustomerStatus(CustomerStatus customerStatus);
}
