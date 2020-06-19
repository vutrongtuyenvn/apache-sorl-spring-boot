package com.solr.core.service;

import com.solr.core.model.Product;
import com.solr.core.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findOneByName(String name) {
        List<Product> products =productRepository.findAllByName(name);
        return products!=null?products.get(0):null;
    }

    @Override
    public List<Product> findAllByName(String name) {
        return productRepository.findAllByName(name);
    }

}
