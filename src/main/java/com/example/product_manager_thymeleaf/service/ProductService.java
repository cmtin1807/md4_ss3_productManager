package com.example.product_manager_thymeleaf.service;

import com.example.product_manager_thymeleaf.model.Product;

import java.util.*;



public class ProductService implements IProductService {
    private static Map<Integer, Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1,"IPhone 6", 1000, "Cu chuoi","Iphone"));
        products.put(2,new Product(2,"IPhone 6s", 1200,"Cung duoc","Iphone"));
        products.put(3,new Product(3,"Samsung s23", 2000,"Ngon","Samsung"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void deleteById(int id) {
        products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productsSearch = new ArrayList<>();
        List<Product> product1;
        product1 =  new ArrayList<>(products.values());
        for (Product product : product1) {
            if (product.getName().contains(name)) {
                productsSearch.add(product);
            }
        }
        return productsSearch;
    }
}
