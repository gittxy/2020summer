package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.AuthorityMapper;
import com.example.bx_web.pojo.Authority;
import com.example.bx_web.service.AuthorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {

	@Resource
	private AuthorityMapper authorityMapper;

	@Override
	public void add(Authority authority) {
		authorityMapper.add(authority);
	}

	@Override
	public void deleteByPriv_id(Long Priv_id) {
		authorityMapper.deleteByPriv_id(Priv_id);
	}

	@Override
	public List<Authority> getAllAuthority() {
		return authorityMapper.getAllAuthority();
	}

	@Override
	public int edit(Authority authority) {
		return authorityMapper.edit(authority);
	}

}
