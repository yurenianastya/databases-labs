package iot.spring.controller;


import iot.spring.domain.Customer;
import iot.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/yurenia_db")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> findAll() throws Exception {
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer findById(@PathVariable Integer id) throws Exception {
        return customerService.findById(id);
    }

    @PostMapping("/customers")
    public void create(@RequestBody Customer entity) throws Exception {
        customerService.create(entity);
    }

    @PutMapping("/customers/{id}")
    public void update(@PathVariable Integer id, @RequestBody Customer entity) throws Exception {
        entity.setId(id);
        customerService.update(entity);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        customerService.delete(id);
    }
}
