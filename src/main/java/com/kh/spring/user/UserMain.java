package com.kh.spring.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		System.out.println("=================== spring container 초기화완료 ===================");
		
		UserController userController = context.getBean(UserController.class);
		String id = "honggd";
		String name = userController.findNameById(id);
		System.out.println(name);
	}

}
