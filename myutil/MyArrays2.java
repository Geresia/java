package myutil;

public class MyArrays2 {

	public static void display(int [] [] ar2) {
		
		for(int row =0; row< ar2.length; row++) {
			
			for(int col = 0; col < ar2[row].length; col++) {
				
				System.out.printf("%3d", ar2[row][col]);
				
			}
			
			System.out.println();
			
		}//end: row
		
	}
	
	
	public static void set(int [][] ar2) {
			int num = 1;
			for(int row =0; row< ar2.length; row++) {
				for(int col = 0; col < ar2[row].length; col++) {
					
					ar2[row][col]=num++;
						
				}
			}
	}
	public static void display_block(int [][] ar2) {
	
		for(int row =0; row< ar2.length; row++) {
			for(int col = 0; col < ar2[row].length; col++) {
				
				if(ar2[row][col]==1) {
					System.out.print("■");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
}




