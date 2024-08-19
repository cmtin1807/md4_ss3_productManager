package com.example.product_manager_thymeleaf.controller;

import com.example.product_manager_thymeleaf.service.IProductService;
import com.example.product_manager_thymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private static IProductService productService = new ProductService();

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }
}
