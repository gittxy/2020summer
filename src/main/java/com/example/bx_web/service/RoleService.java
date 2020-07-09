package com.example.bx_web.service;

import com.example.bx_web.pojo.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface RoleService {
	int add(Role role);
	int edit(Role role);
	int delete(Long id);
	List<Role> getAllRole();
	Role find(Long id);
}
