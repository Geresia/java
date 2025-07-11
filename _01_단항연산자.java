package mymain;

import myutil.MyInteger;

public class _01_단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단항연산자 : ~ ! ++ -- (cast) -(부호) 
		
		// ~ 이진논리 Not 연산자 (1의 보수) 
		
		int n = 10;
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(n)); // 32칸에 대가로 첬다
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(~n)); // 32칸에 대가로 첬다
		
		n = 0xf0f0f0f0;
		//   f = 1111  0 = 0000
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(n)); // 32칸에 대가로 첬다
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(~n)); // 32칸에 대가로 첬다
		
		// ! : 일반논리 Not 연산자
		int a = 3, b = 2;
		boolean b0k = !(a > b);
		System.out.printf("!(%d > %d) : %b\n", a, b, b0k);
		
		// ++ -- : 증(감) 연산자
		// ++ 변수    : 전위형 (모든연산에 앞서 먼저연산)
		//    변수 ++ : 후위형 (모든연산종료후에 연산수행)
		int m = 10;
		System.out.printf("++m : %d m++ : %d\n", ++m, m++);
		
		//형변환(Type Conversion)
		/*
		 * 1. 자동형변환(Promotion): 묵시적형변환
		 *    1)대입(치환)시
		 * 		변수 = 값
		 * 	   (좌) = (우)
		 * 		좌변항의 타입으로 맞춰진다(조건 : 좌 >= 우)
		 * 	  2)연산시: 자료형이 큰쪼으로 맞춰진다
		 * 		1 + 1.0 => 1.0 + 1.0
		 * 		byte + byte -> int
		 * 		short + short -> int
		 * 		byte +  short -> int
		 * 		int형보다 작은 자료형끼리의 연산결과는 int
		 * 		연산전에 int형을 변환시킨후에 연산수행
		 * 		
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 		byte + int -> int
		 * 		
		 * 
		 * 
		 * 2. 강제형변환(cast)
		 */
		
		//1.자동/대입시형변환
		double d = 100; // int -> double : 100 -> 100.0
		
		//2.강제형변환
		byte b1=1, b2=2, b3;
		b3 = (byte) (b1 + b2);
		
		//3.강제형변환
		float f = (float)1.0;
		
		
		//부호연산자(절대값)
		int x = -100;
		int y = (x < 0) ? -x : x;
		
		System.out.printf("|%d| = %d\n", x, y);
		
	}

}
