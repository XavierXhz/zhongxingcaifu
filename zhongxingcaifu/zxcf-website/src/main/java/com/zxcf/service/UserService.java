package com.zxcf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxcf.core.entity.Logininfo;
import com.zxcf.core.mapper.LogininfoMapper;

@Service
public class UserService {

	@Autowired
	private LogininfoMapper logininfoMapper;
	
	public Logininfo findAll() {
		
		return logininfoMapper.selectByPrimaryKey(2l);
	}
	
}
