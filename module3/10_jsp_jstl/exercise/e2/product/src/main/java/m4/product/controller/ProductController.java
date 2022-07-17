package m4.product.controller;

import m4.product.model.Product;
import m4.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("product")
    public String home(){
        List<Product> products = productService.findAll();
        return "home";
    }
}
