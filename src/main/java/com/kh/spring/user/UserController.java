package com.kh.spring.user;

public class UserController {
	
	private UserService userService;  
	
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public String findNameById(String id) {
		String name = userService.findNameById(id);
		return "사용자 이름 : " + name;
	}
}
