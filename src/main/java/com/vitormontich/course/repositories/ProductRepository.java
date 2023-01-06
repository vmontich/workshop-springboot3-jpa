package com.vitormontich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitormontich.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
