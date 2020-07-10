package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMapper {
	int add(Role role);
	int edit(Role role);
	int delete(Long role_id);
	List<Role> getAllRole();
	Role find(Long role_id);
}
