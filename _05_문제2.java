package mymain;

import java.util.Scanner;

public class _05_문제2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double jirum;
		
//		조건1 : 반지름 입력받는다
//		조건2 : 원둘레 = 2 * 파이 * 반지름
//		조건3 : 원면적 = 반지름 * 반지름 * 파이
//		조건4 : 구부피 = 4/3 * 파이의 * 반지름의 3승  
//		조건5 : 출력시 소숫점 1자리까지만 출력해라
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름이 뭐꼬");
		jirum = scanner.nextDouble();
				
		double banjirum = jirum * (2*Math.PI);
		double wonmungjuk = jirum * jirum * Math.PI;
		double gubupi = 4.0 / 3.0 * Math.PI * (jirum * jirum * jirum);
		System.out.printf("원둘레는 : %.1f\n", banjirum);
		System.out.printf("원면적는 : %.1f\n", wonmungjuk);
		System.out.printf("구부피는 : %.1f\n", gubupi);
		
		scanner.nextLine();

		System.out.print("고맙제? “감사합니다”라고 해봐라: ");
		String insungcheck = scanner.nextLine();

		if (insungcheck.equals("감사합니다")) {
		    System.out.println("그래, 담에 또 온나");
		} else {
		    System.out.println("요즘 애들 ㅉㅉ");
		}
		
		scanner.close();
	}
}
