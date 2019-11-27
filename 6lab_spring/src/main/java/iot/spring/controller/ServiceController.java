package iot.spring.controller;


import iot.spring.domain.Service;
import iot.spring.service.ServiceService;
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
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @GetMapping("/services")
    public List<Service> findAll() throws Exception {
        return serviceService.findAll();
    }

    @GetMapping("/services/{id}")
    public Service findById(@PathVariable Integer id) throws Exception {
        return serviceService.findById(id);
    }

    @PostMapping("/services")
    public void create(@RequestBody Service entity) throws Exception {
        serviceService.create(entity);
    }

    @PutMapping("/services/{id}")
    public void update(@PathVariable Integer id, @RequestBody Service entity) throws Exception {
        entity.setId(id);
        serviceService.update(entity);
    }

    @DeleteMapping("/services/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        serviceService.delete(id);
    }
}
