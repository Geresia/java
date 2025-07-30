package myutil;

public class CalcFactory {

	static CalcFactory single = null;
	
	public static CalcFactory getInstance() {
		
		if(single==null)
			single = new CalcFactory();
			
		return single;
	}
	
	//외부에서 생성 못하도록 설정
	private CalcFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public BaseCalc getCalc() {
		
		return new BaseCalcImpl();
	}
}
