package com.example.bx_web.service;

import com.example.bx_web.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> OrderR(int user_id);
    void addorder(Order order);
    void editorder(Order order);
    void deleteorder(Order order);
}
