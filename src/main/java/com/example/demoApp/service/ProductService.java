package com.example.demoApp.service;

import com.example.demoApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"iPhone",500),
            new Product(102,"iPad",600),
            new Product(103,"Cannon",1300)
    ));

    public List<Product> getProducts(){
        Product p=new Product(101,"iPhone",500);


        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(product -> product.getProdId()==prodId)
                .findFirst().orElse(new Product(-1,null,-1));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product){
        Optional
    }
}
