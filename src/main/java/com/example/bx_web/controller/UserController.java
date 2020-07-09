package com.example.bx_web.controller;

import com.example.bx_web.pojo.Role;
import com.example.bx_web.pojo.User;
import com.example.bx_web.service.UserService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@ResponseBody
public class UserController {
    @Autowired
    public UserService userService;
    /**
     * 登录控制器，前后端分离用的不同协议和端口，所以需要加入@CrossOrigin支持跨域。
     * 给VueLoginInfoVo对象加入@Valid注解，并在参数中加入BindingResult来获取错误信息。
     * 在逻辑处理中我们判断BindingResult知否含有错误信息，如果有错误信息，则直接返回错误信息。
     */
    @RequestMapping(value = "/login")
    public String Login(String jsonStr) throws JSONException {
        System.out.println("success");
        String test="{\"username\":\"stockton\",\"password\":\"000000\",\"role_id\":2}";
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        User iuser=userService.userLogin(user);
        System.out.println(JsonUtils.putJson(user));
//        System.out.println(jsonStr);
//        System.out.println(iuser);
        if(iuser!=null){
            System.out.println(JsonUtils.putJson(iuser));
            return JsonUtils.putJson(iuser);
        }
        else{
            System.out.println("failed");
            return null;
        }
    }
    @RequestMapping(value = "/register")
    public void Register(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        userService.userRegister(user);
        System.out.println(JsonUtils.putJson("success"));
    }
    @RequestMapping(value = "/userinfo")
    public String Userinfo(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        User user2= userService.userinfo(user.getUser_id());
        System.out.println(JsonUtils.putJson(user2));
        return JsonUtils.putJson(JsonUtils.putJson(user2));
    }
    @RequestMapping(value = "/modifyinfo")
    public void Modifyinfo(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        userService.modifyinfo(user);
        System.out.println(JsonUtils.putJson("success"));
    }

    @RequestMapping(value = "/addUser")
    public void AddUser(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        userService.add(user);
    }

    @RequestMapping(value = "/deleteUser")
    public void DeleteUser(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        User user = gson.fromJson(jsonStr, User.class);
        userService.delete(user.getUser_id());
    }


    @RequestMapping(value = "/getTotalUser")
    public String GetTotalUser() throws JSONException {
        List<User> list = userService.getAllUser();

        return JsonUtils.putJson(list);
    }

}

