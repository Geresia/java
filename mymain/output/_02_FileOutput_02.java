package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutput_02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("data2.txt");
		
		PrintStream out = new PrintStream(os);
		
		String name = "홍길동";
		int    age = 20;
		double ki = 180.5;
		
		//화일에 출력
		out.printf("이름은 : %s\n", name);
		out.printf("나이는 : %d(살)\n", age);
		out.printf("키 	   : %.1f(cm)\n", ki);
		
		//화면에 출력
		System.out.printf("이름은 : %s\n", name);
		System.out.printf("나이는 : %d(살)\n", age);
		System.out.printf("키 	   : %.1f(cm)\n", ki);
		
		out.close();
		os.close();
	}

}
