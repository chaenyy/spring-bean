package com.kh.spring.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * DI(Dependency Injection) 의존주입
 * 
 *  1. field 주입
 *  2. setter 주입
 *  3. 생성자 주입
 *
 */
// bean으로 관리할 클래스
@Component
public class Person {
	
	Pet pet;
	
	public Person() {
		System.out.println("Person 객체 생성!");
		//System.out.println(pet);
	}

	public Person(Pet pet) {
		System.out.println("Person 객체 생성! : " + pet);
		this.pet = pet;
	}
	
	/**
	 * 
	 * @Autowired는 해당 타입의 빈을 찾아서 의존주입
	 * - 해당 타입의 빈이 2개 이상이라면 오류!
	 * - 이 때 @Qualifier를 통해 이름(bean id)으로 지정 가능
	 * - @Qualifier는 필드주입/setter주입에만 사용가능
	 *  
	 */
	@Qualifier("dog")
	@Autowired
	public void setPet(Pet pet) {
		System.out.println("Person#setPet 호출! : " + pet);
		this.pet = pet;
	}
	
	public Pet getPet() {
		return pet;
	}
}
