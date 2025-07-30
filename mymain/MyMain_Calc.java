package mymain;

import myutil.BaseCalc;
import myutil.BaseCalcImpl;
import myutil.CalcFactory;

public class MyMain_Calc {
	
	public static void main(String[] args) {
		
		System.out.println(BaseCalc.PI);
		
//		BaseCalc.PI = 3.141592;
		
		//인터페이스 = new 클래스()
		//  설명서   = new 설계서()
//		BaseCalc calc = new BaseCalcImpl();
		
		//Design Pattern
		//1.singleton pattern
		//2.factory   pattern
		BaseCalc calc = CalcFactory.getInstance().getCalc();
		
		int x = 10, y =5, result;
		
		result = calc.plus(x, y);
		
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		result = calc.hap(x);
		System.out.printf("%d까지의 합=%d\n", x, result);
		
	}

}
