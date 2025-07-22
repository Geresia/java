package mymain;

import java.util.Scanner;

import myutil.Snail;
import myutil.MyArrays2;

public class MyMain_달팽이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chasu;
		String yn="y"; //개속?
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("차수:");
			chasu = scanner.nextInt();
			
			//달팽이 객체 생성->출력
			
			int[][] result_snail = Snail.make(chasu);
			
			MyArrays2.display(result_snail);
			
			int row_sum = 0;
			int col_sum = 0;
			int diagonal_sum = 0;
			
			for(int i=0; i<chasu; i++) {
				//행합계
				row_sum += result_snail[0][i];
				//열합계
				col_sum += result_snail[i][0];
				//대각합계
				diagonal_sum += result_snail[i][i];
				
				
			}
			System.out.println("---------[result]---------");
			
			System.out.printf("행합계: %d\n", row_sum);
			System.out.printf("열합계: %d\n", col_sum);
			System.out.printf("대각합계: %d\n", diagonal_sum);
			
			//계속?
			System.out.print("계속?(y/n):");
			yn = scanner.next();
			if(!yn.equalsIgnoreCase("Y")){
				break;
			}
			
		}
		
		
		
		scanner.close();
	}

}
