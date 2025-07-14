package mymain;

import java.util.Scanner;

public class _06_for2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		System.out.print("단");
		dan = scanner.nextInt();
		
		//입력한 값을 검증
//		if (!(dan >=2 && dan <=9)) {
		if(dan < 2 || dan > 9) {
			System.out.println("dan은 2~9사이값만 입력하세요");
			return;
		}
		
//	   dan  i (dan * i)
//		5 x 1 =
//		5 x 2 =
//		5 x 3 = 
//		5 x 4 = 
//		5 x 5 = 
//		5 x 6 = 
//		5 x 7 = 
//		5 x 8 = 
//		5 x 9 =
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
		
		
		
		
		
		scanner.close();
	}
}
