package hibernate.yurenia.service;

import hibernate.yurenia.dao.ProductDAO;
import hibernate.yurenia.model.Product;

import java.util.List;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();

    public ProductService() {
    }

    public Product findCustomer(int id) {
        return productDAO.findByID(id);
    }

    public void saveProduct(Product product) {
        productDAO.save(product);
    }

    public void deleteProduct(Product product) {
        productDAO.delete(product);
    }

    public void updateProduct(Product product) {
        productDAO.update(product);
    }

    public List<Product> findAllProducts() {
        return productDAO.findAll();
    }
}
