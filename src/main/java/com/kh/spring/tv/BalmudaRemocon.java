package com.kh.spring.tv;

public class BalmudaRemocon implements RemoteControl {

	public void channelTo(int no) {
		System.out.println("[발뮤다] 채널을 " + no + "번으로 변경합니다.");
	}

}
