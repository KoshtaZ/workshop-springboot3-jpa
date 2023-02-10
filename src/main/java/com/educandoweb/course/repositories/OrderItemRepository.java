package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}