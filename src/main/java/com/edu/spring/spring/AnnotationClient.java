package com.edu.spring.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {
	public static void main(String[] args) {
		//通过指定package扫描的方式初始化AnnotationConfigApplication
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext("com.edu.spring");
		
		System.out.println(context.getBean(MyBean.class)); //通过类型获取bean
		System.out.println(context.getBean("myBean")); //通过名字获取bean
		
		//RunnableFactoryBean中isSingleton方法返回true，则创建单例Jeep对象，false则创建多例Jeep对象
		System.out.println(context.getBean(Jeep.class));
		System.out.println(context.getBean("createRunnableFactoryBean"));
		//获取RunnableFactoryBean本身
		System.out.println(context.getBean(RunnableFactoryBean.class));
		System.out.println(context.getBean("&createRunnableFactoryBean"));
		
		//另一种获取bean的工厂模式，在MyConfig中createCar(CarFactory factory)的factory参数默认按类型调用已配置的方法来获取
		System.out.println(context.getBean(Car.class));
		
		//bean的初始化和销毁   接口实现
		System.out.println(context.getBean(Cat.class));
		//bean的初始化和销毁   自定义方法实现
		System.out.println(context.getBean(Dog.class));
		//bean的初始化和销毁	  使用注解方式实现	这种方法最好
		System.out.println(context.getBean(Animal.class));
		
		//@component注解bean，getBeanOfType默认按类名获取，也可以在注解上指定bean名字
		//如果再在MyConfig中配置的话，会出现个两个User类型的bean，按类型获取就会报错，要按名字获取
		//System.out.println(context.getBean(User.class)); //报错
		System.out.println(context.getBeansOfType(User.class));
		System.out.println(context.getBean("myUser"));
		//@Repository注解bean
		//System.out.println(context.getBean(UserDao.class));
		//@Service注解bean
		System.out.println(context.getBean(UserService.class));
		//@Controller注解bean
		System.out.println(context.getBean(UserController.class));
		
		//依赖注入
		User user = context.getBean("myUser", User.class);
		user.show();
		
		context.close();
	}
}
