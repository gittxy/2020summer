package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    void add(Cart cart);
    void edit(Cart cart);
    void delete(int cart_id);
    List<Cart> findList(int user_id);
    Integer getTotal(int cart_id);

}
