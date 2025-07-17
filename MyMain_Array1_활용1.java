package mymain;

import java.util.Scanner;

public class MyMain_Array1_활용1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//					   0  1  2  3  4  5  6  7  8  9 10 11 <- index
		//					   1  2  3  4  5  6  7  8  9 10 11 12 <- index : month - 1
		int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월:");
		int month = scanner.nextInt();
		 
		int lastday = month_array[month-1];
		
		System.out.printf("[%d]월의 마지막날은 [%d]입니다\n", month, lastday);
		
		scanner.close();
		
		
	}

}
