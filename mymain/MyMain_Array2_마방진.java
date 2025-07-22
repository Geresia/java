package mymain;

import myutil.MaBangJin;
import myutil.MyArrays2;

public class MyMain_Array2_마방진 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chasu = 3;
		
		int [][] result_magic_squre = MaBangJin.make(chasu);
		
		MyArrays2.display(result_magic_squre);
		
	
	
	int row_sum = 0;
	int col_sum = 0;
	int diagonal_sum = 0;
	
	for(int i=0; i<chasu; i++) {
		//행합계
		row_sum += result_magic_squre[0][i];
		//열합계
		col_sum += result_magic_squre[i][0];
		//대각합계
		diagonal_sum += result_magic_squre[i][i];
		
		
	}
	System.out.println("---------[result]---------");
	
	System.out.printf("행합계: %d\n", row_sum);
	System.out.printf("열합계: %d\n", col_sum);
	System.out.printf("대각합계: %d\n", diagonal_sum);
	}

}
