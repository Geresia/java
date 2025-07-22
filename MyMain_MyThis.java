package mymain;

import myutil.MyThis;

public class MyMain_MyThis {
	public static void main(String[] args) {
		MyThis my = new MyThis();
		MyThis my2 = new MyThis();
		
		my.displayThis();
		System.out.println("외부에서 my" + my);
		my2.displayThis();
		System.out.println("외부에서 my" + my2);
	}
}

