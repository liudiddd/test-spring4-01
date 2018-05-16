package com.edu.spring.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages="com.edu.spring", 
	excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE, classes= {DogConfig.class, MyBean.class}))
@Configuration
public class AnnotationScanConfig {

}
