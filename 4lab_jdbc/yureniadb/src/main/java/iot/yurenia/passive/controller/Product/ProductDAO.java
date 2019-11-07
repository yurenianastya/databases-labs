package iot.yurenia.passive.controller.Product;

import iot.yurenia.passive.model.Product;

import java.util.Set;

public interface ProductDAO {
    Product getProduct(int id);
    Set<Product> getAllProducts();
    boolean insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
}