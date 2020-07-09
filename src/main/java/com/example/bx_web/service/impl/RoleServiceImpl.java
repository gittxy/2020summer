package com.example.bx_web.service.impl;


import com.example.bx_web.mapper.RoleMapper;
import com.example.bx_web.pojo.Role;
import com.example.bx_web.service.RoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 角色role的实现类
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;

	@Override
	public int add(Role role) {
		return roleMapper.add(role);
	}

	@Override
	public int edit(Role role) {
		return roleMapper.edit(role);
	}

	@Override
	public int delete(Long id) {
		return roleMapper.delete(id);
	}

	@Override
	public List<Role> getAllRole() {
		return roleMapper.getAllRole();
	}

	@Override
	public Role find(Long id) {
		return roleMapper.find(id);
	}

}
