package com.solr.core.controller;

import com.google.gson.Gson;
import com.solr.core.model.Product;
import com.solr.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/solr")
public class SolrController {
    @Autowired
    private ProductService productService;

    @GetMapping("/create")
    private String create() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "iphone", "black", "7"));
        products.add(new Product("2", "samsung", "green", "2"));
        products.add(new Product("3", "xaomi", "yellow", "6"));
        for (Product product:products
             ) {
            productService.save(product);
        }
        return new Gson().toJson(products);
    }
    @GetMapping("/search/{name}")
    private List<Product> searchProductByName(@PathVariable String name){
        return productService.findAllByName(name);
    }
}
