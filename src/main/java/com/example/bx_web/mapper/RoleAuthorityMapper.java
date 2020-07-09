package com.example.bx_web.mapper;


import com.example.bx_web.pojo.Authority;
import com.example.bx_web.pojo.RoleAuthority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleAuthorityMapper {
    int add(Long role_id,Long privilege_id);
    int delete(Long role_id,Long privilege_id);
    List<Authority> findListByRoleId(Long role_id);
    List<RoleAuthority> getAll();

}
