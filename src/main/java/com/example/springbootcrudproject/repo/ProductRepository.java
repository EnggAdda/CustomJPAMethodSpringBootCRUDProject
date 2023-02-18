package com.example.springbootcrudproject.repo;


import com.example.springbootcrudproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductByName(String name);

    Product getProductByPrice(Double price);

    Product getProductByIdAndName(Long id, String name);





}
