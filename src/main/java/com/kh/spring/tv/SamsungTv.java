package com.kh.spring.tv;

public class SamsungTv implements Tv {
	
	private RemoteControl remocon;

	public SamsungTv() {
		System.out.println("SamsungTv객체 생성!");
	}
	
	public SamsungTv(RemoteControl remocon) {
		System.out.println("SamsungTv객체 생성! : " + remocon);
		this.remocon = remocon;
	}
	
	public void powerOn() {
		System.out.println("SamsungTv PowerOn!");
	}
	public void channelTo(int no) {
		// TODO Auto-generated method stub
		
	}

}
