package mymain;

import java.util.Scanner;

public class _11_dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String yn = "y"; //또 할지 여부?
		int dan ;
		
		do {
			
			System.out.print("단?:");
			dan = scanner.nextInt();
			
			//유효성체크
			if(dan<2 || dan > 9) {
				System.out.println("단은 2~9사이값을 입력하세요");
				continue; //현재조건의 수행명령을 종료하고 다음제어식으로 이동해라
			}
			
			//구구단 출력
			for(int i=1; i<=9; i++) {
				
				if(i%2==0) continue;
				
				System.out.printf("%d x %d = %d\n",dan, i, dan * i);
			}
			
			//또할지여부 결정
			System.out.print("계속?(y/n):");
			yn = scanner.next();
			
		}//while(yn.equals("y") || yn.equals("Y"));
		while(yn.equalsIgnoreCase("y"));//대소문자 구분하지 않고 체크한다
		
		System.out.println("---End---");
				
		
		
		scanner.close();
	}

}
