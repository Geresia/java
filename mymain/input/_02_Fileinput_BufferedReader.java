package mymain.input;

import java.io.*;

public class _02_Fileinput_BufferedReader {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		Reader isr = new FileReader("src/mymain/input/_02_Fileinput_byte.java");
        BufferedReader br = new BufferedReader(isr);
		
		
		
		while(true){
			
//			int ch = isr.read();
//			
//			if(ch==-1)break;
//			
//			System.out.printf("%c", ch);
//			
			String data = br.readLine();//줄단위로 읽는다(엔터를 구분자: 엔터는 버린다)
			if(data == null)break;
			
			System.out.println(data);
			
			Thread.sleep(5);
			
		}
		//ㅎㅇㅎㅇㅎㅇ
		isr.close();
	}

}
