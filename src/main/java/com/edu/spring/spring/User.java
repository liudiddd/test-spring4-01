package com.edu.spring.spring;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myUser")
public class User {
	
	@Autowired //Spring的注解，使用Autowired不需要setter方法
	private UserService userService;
	
	@Resource //JSR-250的注解
	private Car car;
	
	@Inject //JSR-330的注解，依赖javax.inject
	private Cat cat;
	
	public void show() {
		System.out.println("===show===");
		System.out.println(userService);
		System.out.println(car);
		System.out.println(cat);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
