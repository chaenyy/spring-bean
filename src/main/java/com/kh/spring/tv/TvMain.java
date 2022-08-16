package com.kh.spring.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
		String configLocation = "classpath:tv-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println("================= spring container 초기화 완료 =================");
		
		Tv lgTv = (Tv) context.getBean("lgTv"); // id로 가져오기
		lgTv.powerOn();
		
		Tv lgTv2 = context.getBean(LgTv.class); // class객체 전달하기
		lgTv2.powerOn();
		
		System.out.println(lgTv);
		System.out.println(lgTv2);
		System.out.println(lgTv == lgTv2);
		
		lgTv.channelTo(10);
		
		Tv samsungTv = context.getBean(SamsungTv.class);
		System.out.println(samsungTv);
		
	}

}
