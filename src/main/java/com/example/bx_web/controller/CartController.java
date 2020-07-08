package com.example.bx_web.controller;

import com.example.bx_web.pojo.Cart;
import com.example.bx_web.pojo.Total;
import com.example.bx_web.service.CartService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class CartController {
    @Autowired
    public CartService cartService;

    @RequestMapping(value = "/cart")
    public String Cart(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Cart cart = gson.fromJson(jsonStr, Cart.class);
        List<Cart> cartr=cartService.findList(cart.getUser_id());
        return JsonUtils.putJson(cartr);
    }

    @RequestMapping(value = "/addcart")
    public void AddCart(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Cart cart = gson.fromJson(jsonStr, Cart.class);
        cartService.add(cart);
    }

    @RequestMapping(value = "/deletecart")
    public void DeleteCart(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Type type = new TypeToken<List<Cart>>(){}.getType();
        List<Cart> list = gson.fromJson(jsonStr, type);
        for (int i = 0; i < list.size(); i++) {
            cartService.delete(list.get(i).getCart_id());
        }
    }

    @RequestMapping(value = "/editcart")
    public void EditCart(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Cart cart = gson.fromJson(jsonStr, Cart.class);
        cartService.edit(cart);
    }

    @RequestMapping(value = "/gettotalcart")
    public String GettotalCart(String jsonStr) throws JSONException {
        int total=0;
        Gson gson=new Gson();
        Type type = new TypeToken<List<Cart>>(){}.getType();
        List<Cart> list = gson.fromJson(jsonStr, type);
        for (int i = 0; i < list.size(); i++) {
            total+=cartService.getTotal(list.get(i).getUser_id());
        }
        Total t =new Total();
        t.setTotal(total);
        return JsonUtils.putJson(t);
    }
}
