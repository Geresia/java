package mymain;

public class _02_정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 자료형 : byte short int(기본형) long 
		// 상수 (리터럴) : 1 0. <- 소숫점이 없는 수를 정수라고 한다
		// 				   1L   <- long형
		// 출력서식      : %d (decimal:10진수출력)
		//				   %o (octal  : 8진수출력)
		//				   %x (hexa   :16진수출력)
		
		System.out.printf("10진수: %d\n", 100);
		System.out.printf(" 8진수: %o\n", 100);
		System.out.printf("16진수: %x\n", 100);
		
		// 8진수 표현 : 0144 
		//16진수 표현 : 0x64
		System.out.printf("0144 : %d\n", 0144);
		System.out.printf("0x64 : %d\n", 0x64);
		
		//변수 선언
		//자료형 변수명:
		int n = 123;
		//Type mismatch: cannot convert from int to byte
		byte b1 = 100;
		
		//자릿수를 지정해서 출력
		System.out.printf("[%10d\n %10d]", n, b1); //right align
		System.out.printf("[%010d]\n", n); //right align + 빈공간 0 으로 채워짐
		System.out.printf("[%-10d\n %-10d]", n, b1); //left align
		//출력자릿수가 더크면 확보된 자리수는 무시된다
		System.out.printf("[%2d]\n", n); //left align

	}

}
