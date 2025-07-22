package mymain;

import myutil.MyArrays2;

public class MyMain_Array2_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//					  갯수생략
		int[][] mm = new int [] [] {
									{1,2,3,4}, // 1차원 배열이 3개가 있다
									{5,6,7,8},
									{9,10,11,12}};
						
		int[][] mm2 = new int [] [] {
									{1,2,3,4}, // 1차원 배열이 3개가 있다
									{5,6,7,8},
									{9,10,11,12}};
									
		MyArrays2.display(mm);
		MyArrays2.display(mm2);
		
		
		int [][] block_t = {
								{1,1,1},
								{0,1,0},
								{0,1,0}					
							};
		int [][] block_L = {
				{1,0,0},
				{1,0,0},
				{1,1,1}					
		};
		int [][] block_Box = {
				{1,1,1},
				{1,1,1},
				{1,1,1}					
		};
		int [][] block_Special = {
				{1,1,1,0,1,0,0,0,1,0,0,1,0,0,1,1,1,0,1,0,1},
				{1,0,1,0,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,1,1},
				{1,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,0,1}					
		};
		System.out.println("---[T Block]---");
		MyArrays2.display_block(block_t);
		System.out.println("---[L Block]---");
		MyArrays2.display_block(block_L);
		System.out.println("---[Box Block]---");
		MyArrays2.display_block(block_Special);
		
	}
}
