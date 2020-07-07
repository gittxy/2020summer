package com.example.bx_web.dao;

import com.example.bx_web.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    Order OrderR(String order_id);
}
