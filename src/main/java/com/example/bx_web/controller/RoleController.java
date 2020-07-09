package com.example.bx_web.controller;

import com.example.bx_web.pojo.Role;
import com.example.bx_web.service.RoleService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
public class RoleController {
    @Autowired
    public RoleService roleService;

    @RequestMapping(value = "/addRole")
    public void AddRole(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        roleService.add(role);
    }

    @RequestMapping(value = "/deleteRole")
    public void DeleteRole(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        roleService.delete(role.getRole_id());
    }

    @RequestMapping(value = "/editRole")
    public void EditAuthority(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        roleService.edit(role);
    }

    @RequestMapping(value = "/getTotalRole")
    public String GetTotalRole() throws JSONException {
        List<Role> list = roleService.getAllRole();

        return JsonUtils.putJson(list);
    }

    @RequestMapping(value = "/getRoleById")
    public String Cart(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        Role roler=roleService.find(role.getRole_id());
        return JsonUtils.putJson(roler);
    }
}
