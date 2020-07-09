package com.example.bx_web.controller;

import com.example.bx_web.pojo.Authority;
import com.example.bx_web.pojo.Role;
import com.example.bx_web.pojo.RoleAuthority;
import com.example.bx_web.service.RoleAuthorityService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class RoleAuthorityController {
    @Autowired
    public RoleAuthorityService roleAuthorityService;

    @RequestMapping(value = "/addAuthority")
    public void AddAuthority(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        Authority authority = gson.fromJson(jsonStr, Authority.class);
        roleAuthorityService.add(role.getRole_id(),authority.getPriv_id());
    }

    @RequestMapping(value = "/deleteAuthority")
    public void DeleteAuthority(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        Authority authority = gson.fromJson(jsonStr, Authority.class);
        roleAuthorityService.delete(role.getRole_id(),authority.getPriv_id());
    }

    @RequestMapping(value = "/getAuthorityByRoled")
    public String Authority(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Role role = gson.fromJson(jsonStr, Role.class);
        List<Authority> authorityr=roleAuthorityService.findListByRoleId(role.getRole_id());
        return JsonUtils.putJson(authorityr);
    }

    @RequestMapping(value = "/getTotalRoleAuthority")
    public String GetTotalAuthority() throws JSONException {
        List<RoleAuthority> list = roleAuthorityService.getAll();

        return JsonUtils.putJson(list);
    }
}
