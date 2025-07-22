package mymain;

import myutil.MyArrays2;

public class MyMain_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//					  행 열
		int [][] mm = new int[3][3];
		
		mm[0][0] = 1;
		mm[0][1] = 2; 
		
		MyArrays2.set(mm);
		MyArrays2.display(mm);
		
	}

}
