package com.smart.service;

import com.smart.dao.UserMapper;
import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;


	public boolean hasMatchUser(final String username,final String password){
		return userMapper.hasMatchUser(username,password);
	}

}
