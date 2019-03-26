package com.example.demo.app.order;

import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
    List<OrderEntity> getOrder();
    void saveOrder(OrderDto orderDto);

}