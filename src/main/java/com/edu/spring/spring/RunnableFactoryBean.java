package com.edu.spring.spring;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep>{
	@Override
	public Jeep getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Jeep();
	}
	
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Jeep.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
}
