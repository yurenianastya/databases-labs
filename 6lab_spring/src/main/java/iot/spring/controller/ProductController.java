package iot.spring.controller;


import iot.spring.domain.Product;
import iot.spring.service.ProductService;
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
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> findAll() throws Exception {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Integer id) throws Exception {
        return productService.findById(id);
    }

    @PostMapping("/products")
    public void create(@RequestBody Product entity) throws Exception {
        productService.create(entity);
    }

    @PutMapping("/products/{id}")
    public void update(@PathVariable Integer id, @RequestBody Product entity) throws Exception {
        entity.setId(id);
        productService.update(entity);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        productService.delete(id);
    }
}
