package com.kh.spring.tv;

public class LgTv implements Tv {
	
	private RemoteControl remocon;

	public LgTv() {
		System.out.println("LgTv객체 생성!");
	}
	
	/**
	 * setter를 이용한 의존주입 DI
	 * @param remocon
	 */
	public void setRemocon(RemoteControl remocon) {
		System.out.println("LgTv#setRemocon 호출! : " + remocon);
		this.remocon = remocon;
	}
	
	public void channelTo(int no) {
		remocon.channelTo(no);
	}
	
	public void powerOn() {
		System.out.println("LgTv Power On!");
	}

}
