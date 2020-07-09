package com.example.bx_web.mapper;


import com.example.bx_web.pojo.Authority;
import com.example.bx_web.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorityMapper {
	void add(Authority authority);
	void deleteByPriv_id(Long priv_id);
	List<Authority> getAllAuthority();
	int edit(Authority authority);
}
