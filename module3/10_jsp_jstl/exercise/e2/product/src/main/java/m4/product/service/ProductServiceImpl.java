package m4.product.service;

import m4.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product getById(int id) {
        return null;
    }
}
