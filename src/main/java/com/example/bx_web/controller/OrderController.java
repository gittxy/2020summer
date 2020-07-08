package com.example.bx_web.controller;

import com.example.bx_web.pojo.Order;
import com.example.bx_web.pojo.User;
import com.example.bx_web.service.*;
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
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order")
    public String Order(String jsonStr) throws JSONException {
//        //Order order = orderService.OrderR("10000002");
//        String Str = "{\"user_id\":\"162756\"}";
        Gson gson = new Gson();
        Order order = gson.fromJson(jsonStr, Order.class);
        System.out.println(order.getUser_id());
        List<Order> orderlist =orderService.OrderR(order.getUser_id());
//        System.out.println(JsonUtils.putJson(orderlist)+"hhh");
        return JsonUtils.putJson(orderlist);
    }

    @RequestMapping(value = "/addorder")
    public void AddOrder(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Type type = new TypeToken<List<Order>>(){}.getType();
        List<Order> list = gson.fromJson(jsonStr, type);
        for (int i = 0; i < list.size(); i++) {
            orderService.addorder(list.get(i));
        }
    }

}

