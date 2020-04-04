package iot.spring.service;

import iot.spring.domain.Product;
import iot.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() throws Exception {
        List<Product> products = new LinkedList<>(productRepository.findAll());
        if (products.isEmpty()) {
            return null;
        }
        return products;
    }

    public Product findById(Integer id) throws Exception {
        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Product entity) throws Exception {
        if (entity != null) {
            productRepository.save(entity);
        }
    }

    @Transactional
    public void update(Product product) throws Exception {
        productRepository.findById(product.getId())
                .map(oldEntity -> {
                    oldEntity.setName(product.getName());
                    oldEntity.setPrice(product.getPrice());
                    oldEntity.setQuantity(product.getQuantity());
                    oldEntity.setBusinessId(product.getBusinessId());
                    return productRepository.save(oldEntity);
                })
                .orElseGet(() -> productRepository.save(product));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (productRepository.findById(id).isPresent()) {
            productRepository.delete(findById(id));
        }
    }
}
