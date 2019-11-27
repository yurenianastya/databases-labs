package iot.spring.controller;


import iot.spring.domain.Country;
import iot.spring.service.CountryService;
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
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/countries")
    public List<Country> findAll() throws Exception {
        return countryService.findAll();
    }

    @GetMapping("/countries/{id}")
    public Country findById(@PathVariable Integer id) throws Exception {
        return countryService.findById(id);
    }

    @PostMapping("/countries")
    public void create(@RequestBody Country entity) throws Exception {
        countryService.create(entity);
    }

    @PutMapping("/countries/{id}")
    public void update(@PathVariable Integer id, @RequestBody Country entity) throws Exception {
        entity.setId(id);
        countryService.update(entity);
    }

    @DeleteMapping("/countries/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        countryService.delete(id);
    }
}
