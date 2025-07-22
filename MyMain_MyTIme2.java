package mymain;

import myutil.MyTime2;

public class MyMain_MyTIme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTime2 tm = new MyTime2();
		
		tm.display3();
		
		MyTime2 tm2  = new MyTime2(18);
		tm2.display3();
		
		MyTime2 tm3  = new MyTime2(15, 30);
		tm3.display3();
	}

}