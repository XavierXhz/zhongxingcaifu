package com.zxcf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zxcf.core.entity.Logininfo;
import com.zxcf.core.mapper.LogininfoMapper;

@Service
public class UserService {

	@Autowired
	private LogininfoMapper logininfoMapper;
	
	public List<Logininfo> findAll() {
		List<Logininfo> selectByExample = logininfoMapper.selectByExample(null);
		
		return selectByExample;
	}
	
}
