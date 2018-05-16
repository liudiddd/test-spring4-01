package com.edu.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired //使用Autowired不需要setter方法
	@Qualifier("createUserDao")
	private UserDao userDao;
	
	public void show() {
		System.out.println("===show===");
		System.out.println(userDao);
		
	}

	public UserDao getUserDao() {
		return userDao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userService = UserService [userDao=" + userDao + "]";
	}
}
