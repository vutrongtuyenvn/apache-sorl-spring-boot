package com.solr.core.repository;

import com.solr.core.model.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface ProductRepository extends SolrCrudRepository<Product,String> {
    List<Product> findAllByName(String name);
}
