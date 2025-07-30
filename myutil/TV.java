package myutil;

public class TV implements RemoteCon {
	
	int volume = 10;
	int channel = 0;
	
	boolean bOnOff 		= false; //켜짐/꺼짐
	boolean bSoundOff 	= false; //음소거상태냐?

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		if(volume > Volume.MAX)
			volume = Volume.MAX;
		display();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		if(volume < Volume.MIN)
			volume = Volume.MIN;
		display();
	}

	@Override
	public void volumeZero() {
		// TODO Auto-generated method stub
		bSoundOff = !bSoundOff; //true <-> false
		
		display();
		

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channel++;
		if(channel > Channel.MAX)
			channel = Channel.MAX;
		display();

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		channel--;
		if(channel < Channel.MIN)
			channel = Channel.MIN;
		display();
	}

	@Override
	public void setChannel(int ch) {
		// TODO Auto-generated method stub
		
		if(ch < Channel.MIN || ch > Channel.MAX) {
			System.out.println("유효하지 않는 채널");
			return;
			
		}
		if(ch > 900 && ch < 990) {
			System.out.println("유로체널 결제 코드를 입력하세요");
			return;
			
		}
		channel = ch;
		
		display();
	}

	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		//Toggle 기능 : true <-> false
		bOnOff = !bOnOff;
		
		display();
		
		
	}

	private void display() {
		// TODO Auto-generated method stub
		
		System.out.println("-----[ TV ]-----");
		if(bOnOff==false) {
			
			System.out.println("상태 : 꺼짐");
			return;
		}
		
		//켜졌을떄 상태
		System.out.printf("채널 : %d\n", channel);
		
		if(bSoundOff) {
			System.out.println("소리 : 음소거");
		}else {
			System.out.printf("소리 : %d\n", volume);
		}
		
	}

}
