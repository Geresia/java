package mymain;

public class _05_for1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0; //누적값
		int n = 10;
		for(int i = 0; i <= n; i++) {
			
			//값을 누적
			sum = sum + i;
			
			System.out.print(i);
			if(i < n){
				System.out.print('+');
			}else {
				System.out.print('=');
			}
			
			
//			코드수행상태를 시간만큼 정지 시킨다
			Thread.sleep(100);
			
			
		}
		System.out.println(sum);
	}

}
