package com.example.bx_web.service.impl;

import com.example.bx_web.dao.OrderDao;
import com.example.bx_web.model.Order;
import com.example.bx_web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order OrderR(String order_id) {
        return this.orderDao.OrderR(order_id);
    }
}
