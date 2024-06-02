package com.curso.course.repositories;

import com.curso.course.entities.OrderItem;
import com.curso.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
