package mymain.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class _03_Networkinput_bufferedreader {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String host = "https://www.naver.com/";
		URL url = new URL(host);
		InputStream is = url.openStream();
		
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		//Uniform Resource Locator
		
		while(true) {
			
//			int ch = isr1.read();
//		
//			
//			if(ch==-1)break;
//			
//			System.out.printf("%c", ch);
			
			String data = br.readLine();//줄단위로 읽는다(엔터를 구분자: 엔터는 버린다)
			if(data == null)break;
			
			System.out.println(data);
			
			Thread.sleep(120);
		}
	}

}
