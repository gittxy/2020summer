package com.example.bx_web.controller;

import com.example.bx_web.pojo.Authority;
import com.example.bx_web.service.AuthorityService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorityController {
    @Autowired
    public AuthorityService authorityService;

    @RequestMapping(value = "/addAuthority")
    public void AddAuthority(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Authority authority = gson.fromJson(jsonStr, Authority.class);
        authorityService.add(authority);
    }

    @RequestMapping(value = "/deleteAuthority")
    public void DeleteAuthority(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Authority authority = gson.fromJson(jsonStr, Authority.class);
        authorityService.deleteByPriv_id(authority.getPriv_id());
    }

    @RequestMapping(value = "/editAuthority")
    public void EditAuthority(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Authority authority = gson.fromJson(jsonStr, Authority.class);
        authorityService.edit(authority);
    }

    @RequestMapping(value = "/getTotalAuthority")
    public String GetTotalAuthority() throws JSONException {
        List<Authority> list = authorityService.getAllAuthority();

        return JsonUtils.putJson(list);
    }
}
