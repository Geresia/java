package mymain;

public class _01_논리형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리형 자료형 : boolean
		//         상수 : true or false(리터럴)
		//     출력서식 : %b or %B
		//              : 줄바꾸기 서식 : %n or \n
		//
		
		System.out.println(true);
		System.out.printf("%b %B\n" , true, true);

		//변수선언
		//자료형 변수명;
		boolean b0k;
		
		b0k = 3 > 2; //관계연산자
		
		System.out.printf("3 > 2 : %b\n", b0k);
		
		b0k = "파리" == "새" ; 
		System.out.printf("파리 == 새 : %b\n", b0k);
		
		b0k = "파리" == "파리" ; 
		System.out.printf("파리 == 파리 : %b\n", b0k);
		
		//상수
		final boolean bMan = true;
//		bMan = false;
		
	}

}
