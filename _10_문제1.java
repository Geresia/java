package mymain;

import java.util.Scanner;

public class _10_문제1 {

	public static void main(String[] args) {
		/*
		 * 1. 키를 입력받는다(cm)
		 * 2. 단위환산(ft/inch)
		 * 
		 * 1 inch = 2.54  cm
		 * 1 ft   =   12inch
		 * 
		 * 3. 
		 * 
		 */
		double height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("키 얼마야?");
		height = scanner.nextDouble();
		
		double inch = height / 2.54;
		
		double feet = inch / 12;
		
		double feet_I = inch % 12;
		
		System.out.printf("너의 키는 %.1f(cm)\n", height);
		System.out.printf("너의 키는 %.1f(in)\n", inch);
		System.out.printf("너의 키는 %d(ft)%.d(in)", (int)feet, (int)feet_I);
		
		
		scanner.close();
	}

}
