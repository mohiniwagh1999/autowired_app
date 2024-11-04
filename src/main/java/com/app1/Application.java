package com.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app1.chip.Robot;
import com.app1.dao.UserDao;
import com.app1.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
//		System.out.println(c.getClass().getName());
//		System.out.println(c.getBeanDefinitionCount());
//		UserService u=c.getBean(UserService.class);
//		String name = u.getName(100);
//		System.out.println(name);
//		Robot r=c.getBean(Robot.class);
//	 r.doWork();
		Robot r=c.getBean(Robot.class);
	System.out.println(r.hashCode());
	
		Robot r1=c.getBean(Robot.class);
		
		System.out.println(r1.hashCode());
	}

}
