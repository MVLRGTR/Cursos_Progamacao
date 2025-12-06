package com.apredendoeduca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apredendoeduca.course.entities.OrderItem;
import com.apredendoeduca.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPk>{

}
