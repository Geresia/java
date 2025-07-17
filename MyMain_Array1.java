package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stack에 선언한 변수는 초기화 안된다
		int n = 0;
		
		//HEAP에 할당된 변수는 자동초기화 된다
		//정수형 	: 0
		// 실수형 	: 0.0
		//boolean 	: false
		//참조형	: null
		int [] mr = new int[4];
		
		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;
		
		System.out.println(mr[2]);
		System.out.println(n);
		
		MyArrays.display(mr);
		
		//mr의 값을 모두 0으로 채우기
//		Arrays.fill(mr, 0);
		MyArrays.fill(mr, 0);
		
		MyArrays.display(mr);
		
	}

}
