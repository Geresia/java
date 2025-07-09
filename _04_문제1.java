package mymain;


//위치 정보를 알려준다
import java.util.Scanner;

public class _04_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int garo, sero; //가로 세로
		
		//System.in : 표준입력장치(키보드)
		//System.out: 표준출력장치
		
		//키보드로 부터 입력 받는다
		Scanner scanner = new Scanner(System.in); //new는 객채
		
		//정수입력받기
		System.out.print("가로:");
		sero = scanner.nextInt();
		
		System.out.print("세로:");
		garo = scanner.nextInt();
		
		System.out.printf("garo : %d\n", garo);
		System.out.printf("sero : %d\n", sero);
		
		int square = garo * sero;
		System.out.printf("면적은 : %d㎠\n", square);
		
		//사용완료후 반납
		scanner.close();
		
	}

}
