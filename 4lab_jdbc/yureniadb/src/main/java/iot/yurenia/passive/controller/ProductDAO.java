package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Product;

import java.util.Set;

public interface ProductDAO {
    Product getProduct();
    Set<Product> getAllProducts();
    boolean insertProduct();
    boolean updateProduct();
    boolean deleteProduct();
}