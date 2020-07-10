package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.OrderMapper;
import com.example.bx_web.pojo.Order;
import com.example.bx_web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<Order> OrderR(int user_id) {
        return this.orderMapper.OrderR(user_id);
    }

    @Override
    public void addorder(Order order) {
        this.addorder(order);
    }

    @Override
    public void editorder(Order order) {
        this.orderMapper.editorder(order);
    }

    @Override
    public void deleteorder(Order order) {
        this.deleteorder(order);
    }
}