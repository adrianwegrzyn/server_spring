package com.example.demo.app.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<OrderEntity> getAllOpinionDiet() {
        return orderService.getOrder();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void sendOpinionDiet(@RequestBody final OrderDto orderDto) {
        orderService.saveOrder(orderDto);
    }


}
