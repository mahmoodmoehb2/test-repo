package net.explorviz.repository;

import net.explorviz.model.Order;

public class OrderRepository {

    public Order findById(Long id) {
        Order order = new Order();
        order.setId(id);
        return order;
    }

    public Order save(Order order) {
        return order;
    }
}
