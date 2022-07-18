package m4.product.service;

import m4.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    private List<Product> products = new ArrayList<>();

    public ProductServiceImpl(){
        products.add(new Product(1, "Iphone 14", 1800.0, "new phone in 2022", "Apple"));
        products.add(new Product(2, "Samsung A10", 1000.0, "new phone in 2022", "Samsumg"));
        products.add(new Product(3, "Oppo A123", 988.0, "new phone in 2022", "Oppo"));
        products.add(new Product(4, "Google Pixel", 2300.0, "new phone in 2022", "Google"));
        products.add(new Product(5, "LG 1234", 555.0, "new phone in 2022", "LG"));
    }

    @Override
    public List<Product> findAll() {
        return products;
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
