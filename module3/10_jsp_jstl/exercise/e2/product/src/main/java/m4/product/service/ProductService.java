package m4.product.service;

import m4.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    void delete(int id);
    Product getById(int id);
}
