package com.guisilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guisilva.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
