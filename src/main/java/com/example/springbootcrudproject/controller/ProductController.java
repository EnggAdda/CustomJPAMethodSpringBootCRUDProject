package com.example.springbootcrudproject.controller;


import com.example.springbootcrudproject.entity.Product;
import com.example.springbootcrudproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/name/{name}")
    public Product findById(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }


}

