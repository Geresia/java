package myutil;

// 자바의 모든 객체는 Object로 부터 상속 받는다
public class BaseCalc /* extends Object */{
	
	public int plus(int a, int b) {
		
		return a + b;
	}
	public int minus(int a, int b) {
		
		return a - b;
	}
	public double times(double a, double b) {
		
		return a * b;
	}
	public int times(int a, int b) {
		
		return a * b;
	}
	public int divide(int a, int b) {

		
		return (b==0)? 0 : a / b;
	}
	
}
