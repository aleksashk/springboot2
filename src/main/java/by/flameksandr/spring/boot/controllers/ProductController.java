package by.flameksandr.spring.boot.controllers;

import by.flameksandr.spring.boot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/{name}")
    public void addProduct(@PathVariable String name) {
        productService.addProduct(name);
    }
}
