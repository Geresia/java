package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_Array1_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; //변수선언과 동시에 값을 넣는것; 초기화
		
		//배열초기화 
		int [] ar1 = new int[]{1, 2, 3, 4, 5};
		int [] ar2 = 		   {3, 1, 5, 2, 4};
		
		MyArrays.display(ar1);
		
		
		
		System.out.println("---[before sort]---");
		MyArrays.display(ar2);
		
		
		System.out.println("---[after sort]---");
		
		//기존API이용
		//Arrays.sort(ar2);
		MyArrays.sort_asc(ar2);
		MyArrays.display(ar2);
		System.out.println("---[sort_desc]---");
		
		MyArrays.sort_desc(ar2);
		MyArrays.display(ar2);
		System.out.println("---[after asc(1~3) sort]---");
		MyArrays.sort_asc(ar2, 1, 4);
		MyArrays.display(ar2);
		System.out.println("---[after desc(1~3) sort]---");
		MyArrays.sort_desc(ar2, 1, 4);
		MyArrays.display(ar2);
		System.out.println("---[after bubble_sort_asc]---");
		MyArrays.bubble_sort_asc(ar2);
		MyArrays.display(ar2);
		System.out.println("---[after bubble_sort_desc]---");
		MyArrays.bubble_sort_desc(ar2);
		MyArrays.display(ar2);
	}

}
