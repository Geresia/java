package mymain;

import myutil.MyDate;

public class MyMain_MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 참조변수 = new 클래스명(0 <- 객체
		//MyDate의 인스턴스(객체)
		MyDate in = new MyDate();
		in.setYear(2025);
		
		in.setMonth(7);		
		
		in.setDay(21);
		
		in.setWeekday(2);
	
		in.display();
		
		//int year = in.year;
		int year = in.year;
		
		//The field MyDate.month is not visible
		//int month = in.month;
		int month = in.getMonth();
		int day	  = in.getDay();
		int weekday = in.getWeekday();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(weekday);

	}

}
