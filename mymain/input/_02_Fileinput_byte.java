package mymain.input;

import java.io.*;

public class _02_Fileinput_byte {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("src/mymain/input/_02_Fileinput_byte.java");
		
		while(true){
			
			int ch = is.read();
			  
			if(ch==-1)break;
			
			System.out.printf("%c", ch);
			
			Thread.sleep(5);
			
		}
		
		is.close();
	}

}
