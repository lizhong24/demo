package com.wolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolf.dao.IUserDao;
import com.wolf.entity.User;
import com.wolf.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	@Autowired
	public IUserDao udao;
	
	@Override
	public User getUserById(int id) {
		return udao.selectByPrimaryKey(id);
	}
}
