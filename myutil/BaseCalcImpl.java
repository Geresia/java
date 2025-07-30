package myutil;

public class BaseCalcImpl implements BaseCalc{

	@Override
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public int hap(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum *= i;
		}
		
		return sum;
	}
	
}
