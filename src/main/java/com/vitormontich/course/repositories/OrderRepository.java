package com.vitormontich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitormontich.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
