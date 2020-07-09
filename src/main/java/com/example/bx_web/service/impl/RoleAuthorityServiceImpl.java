package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.RoleAuthorityMapper;
import com.example.bx_web.pojo.Authority;
import com.example.bx_web.pojo.RoleAuthority;
import com.example.bx_web.service.RoleAuthorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("roleAuthorityService")
public class RoleAuthorityServiceImpl implements RoleAuthorityService {
    @Resource
    private RoleAuthorityMapper roleAuthorityMapper;

    @Override
    public int add(Long role_id,Long privilege_id) {return roleAuthorityMapper.add(role_id,privilege_id);}

    @Override
    public int delete(Long role_id,Long privilege_id){return roleAuthorityMapper.delete(role_id,privilege_id);}

    @Override
    public List<Authority> findListByRoleId(Long role_id){return roleAuthorityMapper.findListByRoleId(role_id);}

    @Override
    public List<RoleAuthority> getAll(){return roleAuthorityMapper.getAll();}
}
