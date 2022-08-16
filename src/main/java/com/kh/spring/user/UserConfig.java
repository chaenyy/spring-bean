package com.kh.spring.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfig {
	
	/**
	 * id : 메소드명 userController
	 * class : 리턴타입
	 * 
	 * @return
	 */
	@Bean
	@Scope
	@Lazy
	public UserController userController() {
		return new UserController(userService());
	}
	
	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
	
	
}
