package mymain;

import myutil.MyInteger;

public class _03_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.printf("[%32s]:n\n", MyInteger.toBinaryString(n));
		System.out.printf("[%32s]:n>>2\n", MyInteger.toBinaryString(n>>2));
		System.out.printf("[%32s]:n<<2\n", MyInteger.toBinaryString(n<<2));
		n = -1;
		System.out.printf("[%32s]:n\n", MyInteger.toBinaryString(n));
		System.out.printf("[%32s]:n>>4\n", MyInteger.toBinaryString(n>>4));
		System.out.printf("[%32s]:n>>>4\n", MyInteger.toBinaryString(n>>>4));
		
	}	

}
