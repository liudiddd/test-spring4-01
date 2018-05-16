package com.edu.spring.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {
		//使用自定义方法实现bean的初始化和销毁的回调逻辑
		@Bean(initMethod="init", destroyMethod="destroy")
		public Dog createDog() {
			return  new Dog();
		}
}
