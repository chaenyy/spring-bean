package com.kh.spring.pet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PetMain {

	public static void main(String[] args) {
		String configLocation = "classpath:pet-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println("=================== spring container 초기화 완료 ===================");
		
		Person person = context.getBean(Person.class);
		System.out.println(person.getPet());	// com.kh.spring.pet.Dog@1d7acb34

	}

}
