package mymain.input;

import java.io.*;

public class _02_Fileinput_char {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("src/mymain/input/_02_Fileinput_char.java");
		
		//Filter
		Reader isr = new InputStreamReader(is);
		
		while(true){
			
			int ch = isr.read();
			
			if(ch==-1)break;
			
			System.out.printf("%c", ch);
			
			Thread.sleep(5);
			
		}
		//ㅎㅇㅎㅇㅎㅇ
		isr.close();
		is.close();
	}

}
