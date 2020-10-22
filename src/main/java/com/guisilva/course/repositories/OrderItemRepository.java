package com.guisilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guisilva.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
