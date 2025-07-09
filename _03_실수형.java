package mymain;

public class _03_실수형 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수형 자료형 : float double(기본형)
		// 상수(리터럴)  : 1.0 1.0e + 002
		//                1.0F <- float형 리터럴
		// 출력서식      : %f				  (소숫점6자리까지출력)
		//               : %e %E (지수출력)   (소숫점6자리까지출력)
		//                 %g    (자릿가 적을쪽 출력)
		
		double d = 1.2534;
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%E\n", d);
		System.out.printf("%g\n", d);
		
		float f1 = 1.234567890123456789F;
		double d1 = 1.234567890123456789;
		// %m.nf : m(전체자릿수) n(소숫점 이하 자릿수)
		System.out.printf("%.20f\n", f1);
		System.out.printf("%.20f\n", d1);
		
		// 소숫점출력자릿수는 최우선 지켜진다
		System.out.printf("[%30.20f]\n", f1);
		
		
	}
}
