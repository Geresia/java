package myutil;

public class Snail {

	// 방향상수
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int UP = 4;

	// static 메소드
	public static int[][] make(int chasu) {

		int[][] snail_array = new int[chasu][chasu];

		// 달팽이 채우기

		int row = 0;
		int col = -1;
		int dir = RIGHT;

		for (int i = 0; i < chasu * chasu; i++) {
			if (dir == RIGHT) {
				col++;
				if (col == chasu || snail_array[row][col] != 0) { // 오른쪽 끝 넘기면
					row++;
					col--;
					dir = DOWN;
				}
			} else if (dir == DOWN) {
				row++;
				if (row == chasu || snail_array[row][col] != 0) { // 아래 끝 넘기면
					row--;
					col--;
					dir = LEFT;
				}
			} else if (dir == LEFT) {
				col--;
				if (col < 0 || snail_array[row][col] != 0) {
					col++; // ← col = 0 → col++
					row--;
					dir = UP;
				}
			} else if (dir == UP) {
				row--;
				if (row < 0 || snail_array[row][col] != 0) {
					row++;
					col++;
					dir = RIGHT;
				}
			}

			snail_array[row][col] = chasu * chasu - i;
		}

		return snail_array;
	}
	
//	public static int [][] make2(int chasu){
//		
//		int [][] snail_array = new int[chasu][chasu];
//		
//		int row = 0;
//		int col = -1;
//		
//		int sign = 1;
//		
//		int n = chasu;
//		int su = 1;
//		
//		while(n>0) {
//			
//			for(int i = 0; i < 2*n-1; i++)
//				
//				if(i < n)
//					col *= sign;
//				else
//					row += sign;
//			snail_array[row][col] = su++;
//		}
//			sign = -sign;
//			n--;
//		
//	}

}
