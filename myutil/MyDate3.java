package myutil;

public class MyDate3 {
	
	/*
	 * 생성자(constructor) Method
	 * 1.객체생성시 자동호출되는 메소드(1회)
	 * 2.객체내에 변수 및 기타 초기화 기능 수행
	 * 3.형식) 클래스명()
	 * 		   반환형은 없다
	 * 4.생성자는 생략가능함
	 * 	(생략시 JVM에 의해서 기본 
	 * 	 생성자를 만들어서 처리)
	 * 5.Overload가능하다(중복선언)
	 */
	
	int year;
	int month;
	int day;
	
		//기본생성자(default constructor)
		public MyDate3() {
			System.out.println("---MyDate3()---");
			year = 2025;
			month = day = 1;
		}
	
		public MyDate3(int year, int month, int day) {
			this.year	= year;
			this.month	= month;
			this.day	= day;
		}
 
	public MyDate3(int year) {
		this.year = year;
		month = day = 1;
	}
	
	public MyDate3(int year, int month) {
		this.year = year;
		this.month = month;
		this.day = 1;
	}
	
	public void display() {
		System.out.printf("%04d-%02d-%02d\n",
				year,month,day
	);

	}

}
