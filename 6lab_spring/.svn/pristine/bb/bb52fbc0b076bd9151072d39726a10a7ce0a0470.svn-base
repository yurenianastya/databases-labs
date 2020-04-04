package iot.spring.controller;


import iot.spring.domain.Transaction;
import iot.spring.service.TransactionService;
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
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transaction> findAll() throws Exception {
        return transactionService.findAll();
    }

    @GetMapping("/transactions/{id}")
    public Transaction findById(@PathVariable Integer id) throws Exception {
        return transactionService.findById(id);
    }

    @PostMapping("/transactions")
    public void create(@RequestBody Transaction entity) throws Exception {
        transactionService.create(entity);
    }

    @PutMapping("/transactions/{id}")
    public void update(@PathVariable Integer id, @RequestBody Transaction entity) throws Exception {
        entity.setId(id);
        transactionService.update(entity);
    }

    @DeleteMapping("/transactions/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        transactionService.delete(id);
    }
}
