package mymain;
import myutil.MyTime;
import java.time.LocalTime;

public class MyMain_MyTime {

public static void main(String[] args) {
	 	LocalTime now = LocalTime.now();
	
		MyTime d1 = new MyTime(now.getHour(), now.getMinute(), now.getSecond());
		MyTime d2 = new MyTime(16,4,33);
		MyTime d3 = new MyTime(16,4,33);
		MyTime d4 = new MyTime(16,4,33);
		
		
		
		d1.display1();
		d2.display1();
		d3.display2();
		d4.display3();
	}

}
