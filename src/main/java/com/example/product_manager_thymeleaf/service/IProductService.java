package com.example.product_manager_thymeleaf.service;

import com.example.product_manager_thymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);
    void update(int id, Product product);
    List<Product> findByName(String name);

}
