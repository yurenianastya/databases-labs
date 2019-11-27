package iot.spring.service;


import iot.spring.domain.Customer;
import iot.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() throws Exception {
        List<Customer> customers = new LinkedList<>(customerRepository.findAll());
        if (customers.isEmpty()) {
            return null;
        }
        return customers;
    }

    public Customer findById(Integer id) throws Exception {
        if (customerRepository.findById(id).isPresent()) {
            return customerRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Customer entity) throws Exception {
        if (entity != null) {
            customerRepository.save(entity);
        }
    }

    @Transactional
    public void update(Customer customer) throws Exception {
        customerRepository.findById(customer.getId())
                .map(oldEntity -> {
                    oldEntity.setName(customer.getName());
                    oldEntity.setSurname(customer.getSurname());
                    oldEntity.setPhoneNumber(customer.getPhoneNumber());
                    oldEntity.setEmail(customer.getEmail());
                    oldEntity.setIncome(customer.getIncome());
                    oldEntity.setCountryId(customer.getCountryId());
                    return customerRepository.save(oldEntity);
                })
                .orElseGet(() -> customerRepository.save(customer));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (customerRepository.findById(id).isPresent()) {
            customerRepository.delete(findById(id));
        }
    }
}

