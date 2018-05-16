package com.edu.spring.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	//默认bean的名字是方法名，也可以通过name="beanName"自己指定
	//默认返回的bean是单例的，可以使用@Scope("prototype")指定为多例
	@Bean(name = "myBean")
	@Scope("prototype")
	public MyBean createMyBean() {
		return new MyBean();
	}
	
	@Bean
	public RunnableFactoryBean createRunnableFactoryBean() {
		return new RunnableFactoryBean();
	}
	
	@Bean
	public CarFactory createCarFactory() {
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory factory) {
		return factory.create();
	}
	
	//使用InitializingBean、DisposableBean实现bean的初始化和销毁的回调逻辑
	@Bean
	public Cat createCat() {
		return new Cat();
	}
	
	
	
	
	//使用@PostConstruct、PreDestroy实现bean的初始化和销毁的回调逻辑
	@Bean
	public Animal createAnimal() {
		return new Animal();
	}
	
	
	@Bean
	public User createUser() {
		return new User();
	}
	
	//
	@Bean
	//@Primary
	public UserDao createUserDao() {
		return new UserDao();
	}
}
