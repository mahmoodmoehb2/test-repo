package net.explorviz.service;

import net.explorviz.repository.OrderRepository;
import net.explorviz.model.Order;
import net.explorviz.util.DateUtil;

import java.util.Date;

public interface OrderService {

    Order createOrder(Order order);

    default String describeOrder(Order order) {
        return "Order created at " + DateUtil.format(new Date());
    }
}
