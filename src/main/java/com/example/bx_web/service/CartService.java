package com.example.bx_web.service;

import com.example.bx_web.pojo.Cart;

import java.util.List;

public interface CartService {
    void add(Cart cart);
    void edit(Cart cart);
    void delete(int cart_id);
    List<Cart> findList(int user_id);
    Integer getTotal(int cart_id);

}
