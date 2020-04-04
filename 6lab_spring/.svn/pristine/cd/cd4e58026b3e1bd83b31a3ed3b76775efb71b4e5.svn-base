package iot.spring.controller;


import iot.spring.domain.BusinessAccount;
import iot.spring.service.BusinessAccountService;
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
public class BusinessAccountController {
    @Autowired
    BusinessAccountService businessAccountService;

    @GetMapping("/ba")
    public List<BusinessAccount> findAll() throws Exception {
        return businessAccountService.findAll();
    }

    @GetMapping("/ba/{id}")
    public BusinessAccount findById(@PathVariable Integer id) throws Exception {
        return businessAccountService.findById(id);
    }

    @PostMapping("/ba")
    public void create(@RequestBody BusinessAccount entity) throws Exception {
        businessAccountService.create(entity);
    }

    @PutMapping("/ba/{id}")
    public void update(@PathVariable Integer id, @RequestBody BusinessAccount entity) throws Exception {
        entity.setId(id);
        businessAccountService.update(entity);
    }

    @DeleteMapping("/ba/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        businessAccountService.delete(id);
    }
}
