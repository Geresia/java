package mymain;

import java.util.Scanner;

public class _02_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weekday;
		
		String job = "";
		String food= "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("요일: ");
		weekday = scanner.next();
		
		// == 같냐? : primitive(기본형) 자료형
		// String같은 객체형자료형의 체크 : equals()를 이용
		if(weekday.equals("월")) {
			job = "병가 처리";
			food = "제육";
		}else {
			if(weekday.equals("화")) {
				job = "통곡";
				food = "순대 국밥";
			}
			if(weekday.equals("수")) {
				job = "버티기";
				food = "돈까스";
			}
			if(weekday.equals("목")) {
				job = "희망";
				food = "자장면";
			}
			if(weekday.equals("금")) {
				job = "쾌락";
				food = "소주";
			}
			else {
				job = "잠";
				food = "엄마 밥";
			}
		}
		
		System.out.printf("%s(요일) 일정은:%s 점심은:%s\n", weekday, job, food);
		
		scanner.close();
		
		
	}

}
