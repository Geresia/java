package myutil;

public class MyTime {
	int hour;
	int minute;
	int second;
	
	public MyTime() {
		
	}
	
	public MyTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	public MyTime(int h, int m) {
		this.hour = h;
		this.minute = m;
	}
	public MyTime(int h) {
		this.hour = h;
	}
	public void display1() {
		System.out.printf("%02d:%02d:%02d\n",
				hour,minute,second
	);
	}
	public void display2() {
		System.out.printf("%02d시%02d분%02d초\n",
			hour,minute,second
	);
	}
	public void display3() {
		String AmPm;
		if(hour >= 0 && hour < 12) {
			AmPm = "오전";
		}else if(hour == 24) {
			AmPm = "오전";
			hour = 0;
		}else if(hour == 12) {
			AmPm = "오후";
		}else if(hour > 12 && hour < 25){
			hour = hour - 12;
			AmPm = "오후";
		}else{
			System.out.println("틀린 시간입니다");
			return;
		}
		System.out.printf("%s %02d:%02d:%02d\n",
				AmPm, hour,minute,second
		);
}
}