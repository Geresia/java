package mymain;

import java.util.Random;

public class _10_3항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// 형식) (조건) ? 참값 : 거짓값
		
		//난수발생객체
		Random random = new Random();
		
		
		
		//2수중 큰수 구하기
		int a = random.nextInt(10)+ 1; //bound : 경우의 수 (0 Zerobase)
		int b = random.nextInt(10);
		int result = (a > b) ? a : b ;

		System.out.printf("%d, %d중 큰수는 %d입니다.\n", a,b, result);
	}

}
