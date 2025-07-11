package mymain;

public class _06_이진논리연산자2 {
	public static void main(String[] args) {
		
		
		int birthday = 0x19991225;
		// 				0001 1001 1001 1001 0001 0010 0010 0101
		
		System.out.printf("출생년도 : %x\n", birthday);
		
		int year = birthday >>> 16;
		System.out.printf("출생년도 : %x\n", year);
		
		// 출생월 추출
		//		 19991225 >> 8
		//		 00199912        0001  1001
		//   &   000000ff        0000  0000
		//       00000012        0000  0000
		int month = birthday >> 8 & 0x000000ff;
		System.out.printf("출생월   : %x\n", month);
		
		
		int day = birthday & 0xff;
		System.out.printf("출생일   : %x\n", day);
		
		//년도 수정
		//1. 끝자리 2자 지우기
		
		// 방법1
		//   0x19991225
		// & 0xff00ffff
		
		// 방법2
		//      0x19991225
		// ^    0x00990000 
		birthday = birthday ^ 0x00990000;
		System.out.printf("출생년도 : %x\n", birthday);
		
	}
}
