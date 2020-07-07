package com.example.bx_web.controller;

import com.example.bx_web.model.Order;
import com.example.bx_web.service.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order")
    public void os(){
        //Order order = orderService.OrderR("10000002");
        String jsonStr = "{\"order_id\":\"10000002\"}";
        Gson gson = new Gson();
        Order orderJson = gson.fromJson(jsonStr, Order.class);
        Order order = orderService.OrderR(orderJson.getOrder_id());
        System.out.println(order.getUser_id());
    }

}

