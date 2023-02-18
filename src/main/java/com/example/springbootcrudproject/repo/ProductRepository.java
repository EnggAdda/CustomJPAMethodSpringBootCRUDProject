package com.example.springbootcrudproject.repo;


import com.example.springbootcrudproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductByName(String name);

    Product getProductByPrice(Double price);

    Product getProductByIdAndName(Long id, String name);

    @Query("select p from Product p")
    List<Product> getAllProductsUsingJPQL();


    @Query("select p from Product p where p.name =:n")
    List<Product> getAllProductsUsingJPQLQueryParam(@Param("n") String name);

    @Query(value ="select * from Product ", nativeQuery = true)
    List<Product> getAllProductsUsingNative();





}
