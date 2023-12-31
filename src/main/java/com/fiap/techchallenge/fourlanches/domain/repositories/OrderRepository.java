package com.fiap.techchallenge.fourlanches.domain.repositories;

import com.fiap.techchallenge.fourlanches.domain.entities.Order;
import com.fiap.techchallenge.fourlanches.domain.valueobjects.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository {

    Order createOrder(Order order);

    Order getById(Long id);

    boolean save(Order order);

    List<Order> getOrdersByStatus(OrderStatus status);

    List<Order> getAllOrdersOrderedByStatusAndCreatedAt();

    void updateOrder(Long id, Order order);

}
