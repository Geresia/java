package mymain.input;

import java.io.*;

public class _01_keyboardinput_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//표준입출력장치
		//입력 : System.in
		//출력 : System.out
		
		InputStream is = System.in;
		
		//Filter : byte stream -> char stream
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("데이터를 입력해보세요(종료:Ctrl+Z)");
		
		while(true) {
			
			int ch = isr.read();
			
			if(ch==-1)break;
			
			System.out.printf("%c",ch);
			
		}//end:while
		
		System.out.println("---End---");
	}

}
