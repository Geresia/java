package mymain;

public class _12_continue_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break : 현재        영역의 반복문을 탈출하는 명령
		//break label : label 영역의 반복문을 탈출하는 명령
		
		boolean bExit = false;
		
		for(int row=0;row<5;row++) {
		
		for(int col=0;col<5;col++) {
			
			System.out.printf("(%d, %d)",row ,col);
			
			if(row==2 && col==2) {
				bExit = true;
				break;
			}
			
		
		}
		System.out.println();
		if(bExit)break;
		}
		System.out.println("--for문 종료--");
		
		//방법2
		OUT_FOR:
		for(int row=0; row<5 ; row++) {
			for(int col=0;col<5;col++) {
				System.out.printf("(%d, %d)", row, col);
				
				if(row==2 && col==2) {
					 break OUT_FOR;// OUT_FOR영역의 반복문을 탈출
				}
			}
			System.out.println();
		}
		System.out.println("\n--방법2 : for문 종료--");
		
		
		
		//방법3
		// continue			: 현재명령종료하고 다음 제어식으로 이동해라(현재반복문)
		// continue label	: label 영역의 반복문에 적용이 된다
		OUT_FOR2:
		for(int row=0; row<5 ; row++) {
			for(int col=0;col<5;col++) {
				
				if(col>2) {
					System.out.println();
					continue OUT_FOR2;
				}
				
				System.out.printf("(%d, %d)", row, col);
				
			}
			System.out.println();
		}
		System.out.println("--continue : for문 종료--");
	}

}
