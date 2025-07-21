package myutil;

public class MyDate {
	
	//Member Field // 멤버변수 // 인스턴스변수
	//객체지향에서는 변수를 외부로 부터 직접 접근 하지 못하도록 설계한다
	//Encapsulation(캡슐화) or Data Hidding(은닉화)
	/*
	 * Access Modifier(접근제한자)
	 * public : 공개모드
	 * protected : 1) 동일패키지허용
	 * 			 : 2) 자식클래스허용
	 * private	 :    비공개모드
	 * 
	 * (생략)	 : default
	 * 			   1)동일패키지허용
	 * 
	 */
	
	public 		int year; 
	protected 	int month;
	private 	int day;
				int weekday;
				
	// Setter Method
	// 형식) set + month
	// 		 setMonth() : Camel 표기
	public void setMonth(int month) {
		// this : 객체자신
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	
	// Setter Method
	// 형식) set + month
	// 		 setMonth() : Camel 표기
	public int getMonth() {
		
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getWeekday() {
		return weekday;
	}
	public int year() {
		return year;
	}
	
	public void display() {
		
		System.out.printf("%04d-%02d-%02d %d요일\n",
							year,month,day,weekday
				);
	}
}
