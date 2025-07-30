package myutil;

public interface BaseCalc {
	
	//상수/추상메소드/default메소드
	
	public static final double PI2 = 3.14;
	double PI = 3.14;
					 int minus(int a,int b);
	public abstract int plus(int a, int b);
	
//	int plus(int a,int b);
	
	//optional 메소드(필요에 따라서 override해라)
	default int hap(int n) {return 0;}
	
}
