package com.example.demoApp.controller;


import com.example.demoApp.model.Product;
import com.example.demoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        System.out.println(productService.getProducts());
        return productService.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable  int prodId){
        System.out.println(prodId);
        return productService.getProductById(prodId);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }
    @PutMapping("/update_products")
    public Product  updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return productService.getProductById(product.getProdId());
    }

    @DeleteMapping("/delete_products/{prodId}")
    public void  deleteProduct(@PathVariable Integer prodId){
        System.out.println(prodId);
        productService.deleteProduct(prodId);
    }
}
