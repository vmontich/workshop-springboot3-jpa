package com.vitormontich.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitormontich.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
