package net.explorviz.controller;

import net.explorviz.service.OrderService;
import net.explorviz.model.Order;

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order handleOrder(Order order) {
        return orderService.createOrder(order);
    }
}
