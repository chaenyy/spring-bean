package com.kh.spring.tv;

public class DaisoRemocon implements RemoteControl {

	public void channelTo(int no) {
		System.out.println("[다이소] 채널을 " + no + "번으로 변경합니다.");
	}

}
