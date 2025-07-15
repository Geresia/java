package mymain;

public class _21_문제2_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int i=0; i<5; i++) {
		//별5개 찍고 엔터
		for(int k=0;k<5;k++) {
			System.out.print("[*]");
		}
		//줄바꾸기
		System.out.println();
	}
	System.out.println("-----[삼각형1]-----");
	
	for(int i=0; i<5; i++) {
		//별5개 찍고 엔터
		for(int k=0;k<5;k++) {
			if(k<=i) {
				System.out.print("[*]");
			}else {
				System.out.print("[_]");
			}
			
		}
		//줄바꾸기
		System.out.println();
	}
		System.out.println("-----[역삼각형]-----");
		
		for(int i=0; i<5; i++) {
			//별5개 찍고 엔터
			for(int k=0;k<5;k++) {
				if(i<=k) {
					System.out.print("[*]");
				}else {
					System.out.print("[_]");
				}
				
			}
			//줄바꾸기
			System.out.println();
		}
			System.out.println("-----반대편삼각형-----");
			
			for(int i=0; i<5; i++) {
				//별5개 찍고 엔터
				for(int k=5;k>0;k--) {
					if(k<=i+1) {
						System.out.print("[*]");
					}else {
						System.out.print("[_]");
					}
					
				}
				//줄바꾸기
				System.out.println();
			}
				System.out.println("-----[마름모]-----");
				for(int i=0; i<5; i++) {
					//별5개 찍고 엔터
					for(int k=0;k<5;k++) {
						if((k+3)<=i) {
							System.out.print("[_]");
						}else if((i+3)<=k) {
							System.out.print("[_]");
						}else if(k>=(7-i)) {
							System.out.print("[_]");
						}
						else if ((i + k) <= 1) {
							System.out.print("[_]");
						}
						else {
							System.out.print("[*]");
						}
						
					}
					//줄바꾸기
					System.out.println();
				}
					System.out.println("-----[]-----");
			
	}
}