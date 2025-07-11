package mymain;

import java.util.Scanner;

public class _09_일반논리연산자3 {
	public static void main(String[] args) {
		
		//1.년도를 입력받는다
		//2.윤년/평년 구한다 400배수 // 4의 배수이면서 100의 배수가 아닌
		//3. 
		
		//조건1: 400의 배수
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("멫년생이신가요");
		
		double year = scanner.nextDouble();
		
//		boolean yun_1 = (year );
//		boolean yun_2 = (avg>=60);
//		boolean yun_3 = (avg>=60);
		
//		double yun_1 = year / 400; || year / 100 != 0) && year / 4 == 0
		
		if(year % 400 == 0){
			System.out.println("윤년입니다");
		}else if(year % 4 == 0 && year % 100 != 0){
			System.out.println("윤년입니다");
		}else {
			System.out.println("평년입니다");
		}
		
		
		scanner.close();
	}
}
