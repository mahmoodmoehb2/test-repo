package net.explorviz.service.impl;

import net.explorviz.service.OrderService;
import net.explorviz.service.PaymentService;
import net.explorviz.repository.OrderRepository;
import net.explorviz.model.Order;
import net.explorviz.model.Payment;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentService paymentService;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentService paymentService) {
        this.orderRepository = orderRepository;
        this.paymentService = paymentService;
    }

    @Override
    public Order createOrder(Order order) {
        saveOrder(order);
        paymentService.processPayment(new Payment());
        return order;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
