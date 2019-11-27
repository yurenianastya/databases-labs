package iot.spring.controller;


import iot.spring.domain.Currency;
import iot.spring.service.CurrencyService;
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
public class CurrencyController {
    @Autowired
    CurrencyService currencyService;

    @GetMapping("/currencies")
    public List<Currency> findAll() throws Exception {
        return currencyService.findAll();
    }

    @GetMapping("/currencies/{id}")
    public Currency findById(@PathVariable Integer id) throws Exception {
        return currencyService.findById(id);
    }

    @PostMapping("/currencies")
    public void create(@RequestBody Currency entity) throws Exception {
        currencyService.create(entity);
    }

    @PutMapping("/currencies/{id}")
    public void update(@PathVariable Integer id, @RequestBody Currency entity) throws Exception {
        entity.setId(id);
        currencyService.update(entity);
    }

    @DeleteMapping("/currencies/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        currencyService.delete(id);
    }
}
