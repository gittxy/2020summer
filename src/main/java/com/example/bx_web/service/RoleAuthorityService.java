package com.example.bx_web.service;

import com.example.bx_web.pojo.Authority;
import com.example.bx_web.pojo.RoleAuthority;

import java.util.List;

public interface RoleAuthorityService {
    int add(Long role_id,Long privilege_id);
    int delete(Long role_id,Long privilege_id);
    List<Authority> findListByRoleId(Long role_id);
    List<RoleAuthority> getAll();
}
