package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> OrderR(int user_id);
    void addorder(Order order);
    void editorder(Order order);
    void deleteorder(Order order);
}
