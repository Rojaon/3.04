package com.labs.d2.repository;

import com.labs.d2.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void createNewCustomer_correctCase() {
        Customer c1 = new Customer("Sara Ahmed","Silver",2000);
        customerRepository.save(c1);
        List<Customer> customerList = customerRepository.findAll();
        System.out.println(customerList);
        assertEquals(9, customerList.size());
        System.out.println(customerList);
        customerRepository.deleteById(c1.getCustomerId());
    }

    @Test
    public void findByCustomerName_validName_correctCustomer() {
        Optional<Customer> customerOptional = customerRepository.findByCustomerName("Tom Jones");
        assertTrue(customerOptional.isPresent());
        System.out.println(customerOptional.get());
        assertEquals("Gold", customerOptional.get().getCustomerStatus());
    }

    @Test
    public void findByCustomerStatus_validStatus_correctCustomer() {
        List<Customer> customerList = customerRepository.findAllByCustomerStatus("Silver");
        assertEquals(4, customerList.size());
        System.out.println(customerList);
    }

}