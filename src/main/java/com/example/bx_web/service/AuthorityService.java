package com.example.bx_web.service;

import com.example.bx_web.pojo.Authority;

import java.util.List;

public interface AuthorityService {
	void add(Authority authority);
	void deleteByPriv_id(Long roleId);
	List<Authority> getAllAuthority();
	int edit(Authority authority);
}
