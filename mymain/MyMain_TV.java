package mymain;

import myutil.*;

public class MyMain_TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스	  	= 클래스
		
		RemoteCon remoteCon = new TV(); //Factory Pattern
		
		remoteCon.onOff(); //켜짐
		remoteCon.onOff(); //꺼짐
		remoteCon.onOff(); //켜짐
		
		remoteCon.volumeZero();//음소거 설정
		remoteCon.volumeZero();//음소거 해제
		
		//up-casting
		
		
		for(int i = 0; i <= 91; i++) {
		remoteCon.volumeUp();
		}
		for(int i = 0; i <= 100; i++) {
		remoteCon.volumeDown();
		}
		for(int i = 0; i <= 99; i++) {
		remoteCon.channelUp();
		}
		for(int i = 0; i <= 99; i++) {
		remoteCon.channelDown();
		}
		
//		Up-casting
		Channel channel = remoteCon;
		for(int i=0;i<1000;i++) {
			channel.channelUp();
		}
		
		channel.channelDown();
		
		channel.setChannel(9);
		
		remoteCon.setChannel(909);
	}

}
