package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.CartMapper;
import com.example.bx_web.pojo.Cart;
import com.example.bx_web.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("cartService")
public class CartServiceImpl implements CartService {
    @Resource
    private CartMapper cartMapper;


    @Override
    public void add(Cart cart) {
        this.cartMapper.add(cart);
    }

    @Override
    public void edit(Cart cart) {
        this.cartMapper.edit(cart);
    }

    @Override
    public void delete(int cart_id) {
        this.cartMapper.delete(cart_id);
    }

    @Override
    public List<Cart> findList(int user_id) {
        return this.cartMapper.findList(user_id);
    }

    @Override
    public Integer getTotal(int cart_id) {
        return this.cartMapper.getTotal(cart_id);
    }
}
