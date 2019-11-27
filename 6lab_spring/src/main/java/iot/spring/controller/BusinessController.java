package iot.spring.controller;


import iot.spring.domain.Business;
import iot.spring.service.BusinessService;
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
public class BusinessController {
    @Autowired
    BusinessService businessService;

    @GetMapping("/businesses")
    public List<Business> findAll() throws Exception {
        return businessService.findAll();
    }

    @GetMapping("/businesses/{id}")
    public Business findById(@PathVariable Integer id) throws Exception {
        return businessService.findById(id);
    }

    @PostMapping("/businesses")
    public void create(@RequestBody Business entity) throws Exception {
        businessService.create(entity);
    }

    @PutMapping("/businesses/{id}")
    public void update(@PathVariable Integer id, @RequestBody Business entity) throws Exception {
        entity.setId(id);
        businessService.update(entity);
    }

    @DeleteMapping("/businesses/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        businessService.delete(id);
    }
}
