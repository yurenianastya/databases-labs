package iot.spring.controller;


import iot.spring.domain.PrivateAccount;
import iot.spring.service.PrivateAccountService;
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
public class PrivateAccountController {
    @Autowired
    PrivateAccountService privateAccountService;

    @GetMapping("/pa")
    public List<PrivateAccount> findAll() throws Exception {
        return privateAccountService.findAll();
    }

    @GetMapping("/pa/{id}")
    public PrivateAccount findById(@PathVariable Integer id) throws Exception {
        return privateAccountService.findById(id);
    }

    @PostMapping("/pa")
    public void create(@RequestBody PrivateAccount entity) throws Exception {
        privateAccountService.create(entity);
    }

    @PutMapping("/pa/{id}")
    public void update(@PathVariable Integer id, @RequestBody PrivateAccount entity) throws Exception {
        entity.setId(id);
        privateAccountService.update(entity);
    }

    @DeleteMapping("/pa/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        privateAccountService.delete(id);
    }
}
