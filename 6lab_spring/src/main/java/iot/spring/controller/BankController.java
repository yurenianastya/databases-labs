package iot.spring.controller;


import iot.spring.domain.Bank;
import iot.spring.service.BankService;
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
public class BankController {
    @Autowired
    BankService bankService;

    @GetMapping("/banks")
    public List<Bank> findAll() throws Exception {
        return bankService.findAll();
    }

    @GetMapping("/banks/{id}")
    public Bank findById(@PathVariable Integer id) throws Exception {
        return bankService.findById(id);
    }

    @PostMapping("/banks")
    public void create(@RequestBody Bank entity) throws Exception {
        bankService.create(entity);
    }

    @PutMapping("/banks/{id}")
    public void update(@PathVariable Integer id, @RequestBody Bank entity) throws Exception {
        entity.setId(id);
        bankService.update(entity);
    }

    @DeleteMapping("/banks/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        bankService.delete(id);
    }
}
