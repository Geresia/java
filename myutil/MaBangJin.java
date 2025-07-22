package myutil;

public class MaBangJin {

	public static int [][] make(int chasu){
		
		int [] [] ma_array = new int[chasu][chasu];
		
		int row = 0;
		int col = chasu / 2;
		int num = 1;
		
		//1.중앙부터 채운다
		
		ma_array[row][col] = num++;
		
		//2.마방진 채우기
		
		for(int i=0;i<chasu*chasu - 1;i++) {
			
			//윗쪽대각으로 이동해라
			row--;
			col++;
	
			//위/오른쪽 모두 벗어났냐?
			if(row < 0 && col == chasu) {
				row += 2; 
				col--; 
			}else if(row < 0) {
				//윗쪽으로 벗어났냐? => 마지막줄로 이동시킨다
				
				row = chasu-1;
			}else if(col==chasu) {
				//우측으로 벗어났냐?=> 맨앞칸이로 이동시킨다
				col = 0;
			}
			//값이 이미 채워져있냐?
			if(ma_array[row][col] == 1) {
				row = row + 2;
				col--;
			}
			
			//값채우기
			ma_array[row][col] = num++;
			
			
		}
		
		
		
		return ma_array;
	}
}
