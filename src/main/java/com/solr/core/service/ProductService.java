package com.solr.core.service;

import com.solr.core.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Product findOneByName(String name);
    List<Product> findAllByName(String name);

}
