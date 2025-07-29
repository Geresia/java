package mymain;

class A{
	void sub() {}
	final void final_sub() {} //재정의 금지선언
}

final class B extends A{
	
	void sub() {}
	
}

//class C extends B{
//	
//}

class MyString extends String{
	
}


public class MyMain_final {

	public static final double PI = 3.141562;
	//final
	//1. final 변수		: 상수선언
	//2. final method	: 재정의 금지
	//3. final class
	
	public static void main(String[] args) {
		
		//PI = 3.14;
	}
}
