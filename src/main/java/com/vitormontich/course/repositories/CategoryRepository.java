package com.vitormontich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitormontich.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
