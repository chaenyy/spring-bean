package com.kh.spring.user;

public class UserServiceImpl implements UserService {

	public String findNameById(String id) {
		if("honggd".equals(id)) 
			return "홍길동";
		return null;
	}
}
