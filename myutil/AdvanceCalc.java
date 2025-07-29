package myutil;

public class AdvanceCalc extends BaseCalc {
	public int hap(int n) {
		
		int sum = 0;
		
		for(int i=0; i<=n;i++) {
			sum = super.plus(sum, i);//sum = sum + i;
		}
		return sum;
	}
	
	// n's m승 구하기
	public double pow(int n,int m) {
		
		double result = 1.0;
		for(int i=0; i<m;i++) {
			result = super.times(result, n);//result = result * n;
		}
		
		return result;
	}
}
