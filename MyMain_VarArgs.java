package mymain;

import myutil.MyMath;

public class MyMain_VarArgs {
	
	// ellipsis : ... 가변인자
	static void display(int ... nr) {
	//					int [] nr = {10};
	//					int [] nr = {10,20};
	//					int [] nr = {10,20,30};
	System.out.println("[");
	for(int n : nr) {
		System.out.printf("%3d", n);
	}
	System.out.println("]");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가변인자 : 전단인자가 졍해지지 않았다
		display(10);
		display(10, 20);
		display(10, 20, 30);
		
		int result = MyMath.greatest(1,5,3,2,10);
		int result2 = MyMath.least(9,5,3,2,10);
		
		System.out.printf("가장 큰 값순은: %d\n", result);
		System.out.printf("가장 작은 값순은: %d\n", result2);
	}

}
