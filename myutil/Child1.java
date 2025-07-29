package myutil;

public class Child1 extends Parent1{

	// @이름 : annotation(주석: 꼬리표)
	//재정의 : Method Override
	//		 	조건) 1. 이름과 파라메터정보 동일
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("--Child1.sub() call");
	}
}
