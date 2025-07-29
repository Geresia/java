package mymain;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc {
	
	static void onlyBaseCalc(BaseCalc bc) {
							// BaseCalc bc = ac <- Up-casting(권한축소)
		
		System.out.println("---[BaseCalc]---");
		int a = 10, b = 3, result;
		result = bc.plus(a, b);
		System.out.printf("%d + %d = %d\n", a, b, result);
		
	}
	static void onlyObject(Object ob) {
							// Object ob = ac <- Up-casting(권한축소)
		
		System.out.println("---[object]---");
		
		System.out.println(ob.toString());
		
		int n = 10, result;
		
		// down-casint:영역의 확장
		result = ((AdvanceCalc)ob).hap(n);
		
		System.out.printf("%d까지의 합: %d\n", n, result);
		
		Object ob1 = new Object();
		
		AdvanceCalc ac = (AdvanceCalc)ob1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvanceCalc ac = new AdvanceCalc();
		
		onlyBaseCalc(ac);
		
		onlyObject(ac);
		
		System.out.println("---[AdvanceCalc]---");
		
		int x = 10 , y = 3, result;
		
		result = ac.plus(x,y);
		
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		result = ac.hap(x);
		System.out.printf("%d까지의 합=%d\n", x, result);
		
		int a = 2, b = 10;
		double result1 = ac.pow(a, b);
		
		System.out.printf("%d's %d승 = %.0f\n", a, b, result1);
	}

}
